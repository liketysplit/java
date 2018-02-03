// To demonstrate basic operations of a singly linked list (SLL) [only 'head' pointer]
// This code is to be used in conjunction with SinglyLinkedList.java

public class SinglyLinkedListDemo{

		public static void main(String[] args) {
		
			SinglyLinkedList myList = new SinglyLinkedList(); //creates an empty singly linked list object
			
			// you are encouraged to try different operations
			myList.insertAtHead(6);
			myList.insertAtHead(5);
			myList.insertAtHead(3);
		
			myList.PrintList();
		
			myList.insertAtTail(8);
			myList.insertAtTail(9);
		
			myList.PrintList();
		
			
			myList.deleteAtTail();
			myList.PrintList();
		
			myList.deleteAtHead();
			myList.PrintList(); 
		
	}//End_of_main

} //End_of_class
