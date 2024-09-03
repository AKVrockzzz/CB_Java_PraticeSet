package Linked_List;

public class LinkedList {
	class Node {
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	//O(1)
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if(size == 0) {
			head = nn;
			tail = nn;
			size++;
		}
		else {
			nn.next = head;
			head = nn;
			size++;
		}
	}
	
	public void Display() {
		 Node temp = head;
		 while(temp != null) {
			 System.out.print(temp.data + "-->");
			 temp = temp.next;
		 }
		 System.out.println();
	}
}
