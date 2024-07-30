package Assignment_6_Recursion;

import java.util.*;

public class All_Indices_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		ArrayList<Integer> result = All_Indices(arr,0,M);
		
		for(int index : result) {
			System.out.print(index + " ");
		}
		
	}

	public static ArrayList<Integer> All_Indices(int[] arr, int i, int target) {
		// TODO Auto-generated method stub
		if( i >= arr.length) {
			return new ArrayList<>();
		}
		
		ArrayList<Integer> Indices = All_Indices(arr, i+1, target);
		
		if(arr[i] == target) {
			Indices.add(0,i);
		}
		
		return Indices;
		
	}

}
