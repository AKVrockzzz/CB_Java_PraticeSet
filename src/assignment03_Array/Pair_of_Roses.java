package assignment03_Array;
import java.util.*;
public class Pair_of_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int j=0; j<arr.length; j++) {
			arr[j] = sc.nextInt();
		}
		int M = sc.nextInt();
		Pair(arr,M);
		}
	}

	public static void Pair(int[] arr, int m) {
		// TODO Auto-generated method stub
		Sort(arr);
		int target = m;
		int left = Integer.MAX_VALUE;
		int right = Integer.MAX_VALUE;
		int i = 0; 
		int j = arr.length-1;
		while(i<j) {
			int sum = arr[i] + arr[j];
			if(sum > target) {
				j--;
			}
			else if(sum == target) {
				left = arr[i];
				right = arr[j];
				i++;
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + left + " and " + right);
	}
	public static void Sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int idx = miniIdx(arr,i);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}
	public static int miniIdx(int[] arr, int i) {
		int mini = i;
		for(int j=i+1; j<arr.length; j++) {
			if(arr[j] < arr[mini]) {
				mini = j;
			}
		}
		return mini;
	}
}
