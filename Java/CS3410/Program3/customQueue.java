//Rick Boles
//CS 3410: Data Structures
//Programming 3 (Fall 2017)
//Due date: Friday, 27 October 2017, 9:00 p.m

class customQueue{

SinglyLinkedList sll = new SinglyLinkedList();
SinglyLinkedList sllRev = new SinglyLinkedList();
int count = 0;  

    public void customQueue(){

    }

    public void add(int i){
        sll.insertAtHead(i);
        count++;
    }

    public void remove(){
        if (sll.head == null)
            System.out.println("Nothing to delete");
        else if(sll.head.next!=null && count >0){
        sll.deleteAtTail();
        count--;
        System.out.println("Removed Element");
        }
        
        else if (sll.head.next==null){
            sll.head = null;
            count--;
            System.out.println("Removed Element");
        }
    }


    public int getSize(){
        return count;
    }

    public void printAll(){
        if(count > 0){
            Node current = sll.head;
            while(current != null){
                sllRev.insertAtHead(current.obj);
                current = current.next;
            }

            sllRev.PrintList();
        }
        else
            System.out.println("Nothing in Queue!");
    }

    public void printRear(){  
        if(count > 0)
            System.out.println(sll.head.obj);
        else
            System.out.println("Nothing in Queue!");
    }
    public void printFront(){
        if(count > 0){
        Node current = sll.head;
            while(current.next != null)
                current = current.next;
            System.out.println(current.obj);
        }
        else
            System.out.println("Nothing in Queue!");
    }

}