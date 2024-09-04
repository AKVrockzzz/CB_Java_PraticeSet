package Linked_List;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddLast(40);
		ll.AddatIndex(-20, 2);
		ll.AddFirst(23);
		ll.AddFirst(54);
		ll.AddFirst(12);
		ll.AddLast(90);
		ll.Display();
		
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getAtIndex(2));
		System.out.println(ll.removeFirst());
		ll.Display();
		System.out.println(ll.removeLast());
		ll.Display();
		System.out.println(ll.removeAtIndex(4));
		ll.Display();
		
		System.out.println();
		System.out.println();
		System.out.println();
		LinkedList_Implement llm = new LinkedList_Implement();
		llm.AddFirst(10);
		llm.AddFirst(20);
		llm.AddFirst(30);
		llm.AddFirst(40);
		llm.AddLast(50);
		llm.AddAtIndex(-90, 2);
		llm.Display();
		System.out.println(llm.getFirst());
		System.out.println(llm.getLast());
		System.out.println(llm.getAtIndex(2));
		System.out.println();
		llm.Display();
		System.out.println(llm.removeFirst());
		llm.Display();
		System.out.println(llm.removeLast());
		llm.Display();
		
	}

}
