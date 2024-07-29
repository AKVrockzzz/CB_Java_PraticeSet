package Assignment_6_Recursion;

import java.util.Scanner;

public class Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int M =sc.nextInt();
		System.out.println(LastIndex(arr, M, arr.length-1));
	}

	public static int LastIndex(int[] arr, int target, int i) {
		// TODO Auto-generated method stub
		if(i < 0) {
			return -1;
		}
		
		if(arr[i] == target) {
			return i;
		}
		return LastIndex(arr, target ,i - 1);
	}

}
