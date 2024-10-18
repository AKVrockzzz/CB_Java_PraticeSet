package Stacks_Queue_Implementation;
import java.util.*;
import java.util.Stack;
public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		GreaterElement(arr);
	}

	private static void GreaterElement(int[] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + ", " + ans[i]);
		}
	}

}
