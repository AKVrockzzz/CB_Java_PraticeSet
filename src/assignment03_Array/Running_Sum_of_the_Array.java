package assignment03_Array;
import java.util.*;
public class Running_Sum_of_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = Running_Sum(arr);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	public static int[] Running_Sum(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		result[0] = arr[0];
		for(int i=1; i<result.length; i++) {
			result[i] = result[i-1] + arr[i];
		}
		return result;
	}

}
