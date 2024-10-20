package Stacks_Queue_Implementation;

import java.util.Scanner;
import java.util.Stack;
public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Span(arr);
	}

	private static void Span(int[] arr) {
		// TODO Auto-generated method stub
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			
			//Span Calculate
			if(st.isEmpty()) ans[i] = i+1;
			else ans[i] = i-st.peek();
			
			st.push(i);
		}
		
		for(int i=0;i<arr.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println("END");
	}

}
