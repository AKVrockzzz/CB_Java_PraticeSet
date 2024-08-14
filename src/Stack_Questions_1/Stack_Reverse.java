package Stack_Questions_1;
import java.util.*;
public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}
	
	private static void Reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		
		int x = st.pop();
		Reverse(st);
		Insert(st, x);
		
	}

	public static void Insert(Stack<Integer> st, int item) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		int x = st.pop();
		Insert(st, item);
		st.push(x);
	}

}
