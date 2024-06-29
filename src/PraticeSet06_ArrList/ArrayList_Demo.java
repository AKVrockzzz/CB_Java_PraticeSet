package PraticeSet06_ArrList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list);
		//Add
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(1, -9);
		System.out.println(list);
		
		//get
		System.out.println(list.get(3));
		
		// remove
		System.out.println(list.remove(2));
		System.out.println(list);
		
		
		list.add(201);
		list.add(3);
		list.add(21);
		list.add(33);
		System.out.println(list);
		
		
		//Update
		list.set(4, -11);
		System.out.println(list);
		
		//Sort
		Collections.sort(list);;
		System.out.println(list);
		
		
		ArrayList<String> ll = new ArrayList<>();
		ll.add("Ankit");
		ll.add("Raj");
		ll.add("Pooja");
		ll.add("Puneet");
		ll.add("Ankita");
		ll.add("Nora");
		ll.add("Krishana");
		System.out.println();
		System.out.println(ll);
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		for(int i=0; i<ll.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
		//For - Each Loop
		System.out.println();
		System.out.println();
		for(int val : list) {
			System.out.print(val + " ");
		}
		System.out.println();
		for(String val : ll) {
			System.out.print(val + " ");
		}
	}

}
