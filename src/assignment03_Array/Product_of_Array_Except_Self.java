package assignment03_Array;
import java.util.*;
public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] arr = new long[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		long[] product = Product_Of_Array(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(product[i] + " ");
		}
	}
	public static long[] Product_Of_Array(long[] arr) {
		int n = arr.length;
		long[] left = new long[n];
		left[0] = 1;
		for(int i=1; i<n; i++) {
			left[i] = arr[i-1] * left[i-1];
		}
		long[] right = new long[n];
		right[n-1] = 1;
		for(int i=n-2; i>=0; i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		long[] result = new long[n];
		for(int j=0; j<result.length; j++) {
			result[j] = left[j] * right[j];
		}
		return result;
	}

}
