package assignment03_Array;
import java.util.*;
public class Arrays_Target_Sum_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		Arrays.sort(arr);
		Two_Pair_Sum(arr,M);
	}
	
	public static void Two_Pair_Sum(int[] arr, int target) {
		int i = 0;
		int j = arr.length-1;
		int sum = 0;
		while(i<j) {
			sum = arr[i] + arr[j];
			if(sum > target) {
				j--;
			}
			else if(sum <target) {
				i++;
			}
			else {
				System.out.println(arr[i] + " and " + arr[j]);
				i++;
				j--;
			}
		}
	}

}
