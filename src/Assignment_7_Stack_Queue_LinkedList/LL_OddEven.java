package Assignment_7_Stack_Queue_LinkedList;
import java.util.*;
public class LL_OddEven {
	static class Node {
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Node oddHead = null, oddTail = null;
		Node evenHead = null, evenTail = null;
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			Node newNode = new Node(num);
			
			if(num % 2 != 0) {
				if(oddHead == null) {
					oddHead = newNode;
					oddTail = newNode;
				}
				else {
					oddTail.next = newNode;
					oddTail = newNode;
				}
			}
			else {
				if(evenHead == null) {
					evenHead = newNode;
					evenTail = newNode;
				}
				else {
					evenTail.next = newNode;
					evenTail = newNode;
				}
			}
		}
		
		if(oddTail != null) oddTail.next = evenHead;
		
		Node temp = (oddHead != null) ? oddHead : evenHead;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
	}
}
