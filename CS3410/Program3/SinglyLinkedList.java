//End_of_Node_Class
//Rick Boles
//CS 3410: Data Structures
//Programming 3 (Fall 2017)
//Due date: Friday, 27 October 2017, 9:00 p.m


// A class implementing a singly linked list (with 'head' pointer only)

/* one can augment the class with other features (methods) like 
insertBefore(a specific item), deleteBefore(a specific item), etc. */

class Node{
	 public  Object obj;
    public  Node next;
   
	 public  Node(){ // constructor to create a node with null references
       this(null,  null);
    }
    
    public  Node(Object o,  Node n){ // constructor to create a node with the given element and next node
         obj = o;
         next = n;
   }
}

public class SinglyLinkedList{
	public Node head;
	
	public SinglyLinkedList(){ // constructor to create an empty list
		head = null;
	}
		
	//=========== INSERT methods ======================
	
	public void insertAtHead(Object e){
		Node newNode = new Node();
		newNode.obj = e;
		newNode.next = head; // make the link with existing head
		head = newNode; // make the new node to be the new head of the list
	}
	
	public void insertAtTail(Object e){
		Node newNode = new Node();
		newNode.obj = e;
		newNode.next = null;
		
		Node current = head; // start from the beginning
		
		while(current.next != null){ // keep going until reach the tail
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void insertAtPosition(Object e, int index){
		if(index == 0){
				insertAtHead(e);
			return;
		}
		else{
			 Node newNode = new Node();
			 newNode.obj = e;
		
			 Node current = head;
		
			while(index > 1){
			   current=current.next;
				index--;
		   }
		
			newNode.next = current.next;
			current.next = newNode;			
		}
}
	//=========== DELETE methods ======================
	
	public void deleteAtHead(){
		head = head.next;	
	}
	
	
	public void deleteAtTail(){
		Node current = head;
		
		while(current.next.next != null){
			current = current.next;
		}		
		current.next = null;
	}
	
		
	public void deleteAtPosition(int index){
			
	}
	
	//======== Printing the entire list ========
	
	public void PrintList(){
		Node current = head;
		while(current != null){
			System.out.print(current.obj + "-->");
			current = current.next;
		}
	System.out.println("\n======== Printing list is complete. ========");
	}

	
}//End_of_Linked_list_Class
