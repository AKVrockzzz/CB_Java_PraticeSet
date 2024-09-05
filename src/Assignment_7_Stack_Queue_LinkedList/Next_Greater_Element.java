package Assignment_7_Stack_Queue_LinkedList;
import java.util.*;
public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //Read test cases
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt(); //Read Size of array
			int[] arr = new int[N];
			//Taking input of array
			for(int j=0; j<N; j++) {
				arr[j] = sc.nextInt();
			}
			NextGreater(arr);
		}
	}

	public static void NextGreater(int[] arr) {
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
			System.out.println(arr[i] + "," + ans[i]);
		}
		
	}

}
