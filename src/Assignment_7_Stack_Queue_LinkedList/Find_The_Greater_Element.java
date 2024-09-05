package Assignment_7_Stack_Queue_LinkedList;
import java.util.*;
public class Find_The_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// int T = sc.nextInt(); //Read test cases
		
		
			int N = sc.nextInt(); //Read Size of array
			int[] arr = new int[N];
			//Taking input of array
			for(int j=0; j<N; j++) {
				arr[j] = sc.nextInt();
			}
			NextGreater(arr);
		
	}

	public static void NextGreater(int[] arr) {
		// TODO Auto-generated method stub
        int n = arr.length;
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[n];
		for(int i=0; i<2*n; i++) {
            int idx = i % n;
			while(!st.isEmpty() && arr[idx] > arr[st.peek()]) {
				ans[st.pop()] = arr[idx];
			}
            if(i < n) st.push(idx);
		}
		
		while(!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		
	}

}
