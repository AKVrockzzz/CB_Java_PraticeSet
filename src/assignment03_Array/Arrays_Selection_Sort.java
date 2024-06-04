package assignment03_Array;
import java.util.*;
public class Arrays_Selection_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void Sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int idx = minIndex(arr,i);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}
	public static int minIndex(int[] arr, int i) {
		int mini = i;
		for(int j=i+1; j<arr.length; j++) {
			if(arr[j] < arr[mini]) {
				mini = j;
			}
		}
		return mini;
	}

}
