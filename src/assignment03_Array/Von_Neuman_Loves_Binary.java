package assignment03_Array;
import java.util.*;
public class Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Decimal_Array(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void Decimal_Array(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			arr[i] = Binary_ToDecimal(arr,i);
		}
	}
	public static int Binary_ToDecimal(int[] arr, int i) {
		int sum = 0;
		int num = arr[i];
		int pow = 0;
		while(num > 0) {
			int rem = num % 10;
			sum += rem * Math.pow(2,pow);
			pow++;
			num /= 10;
		}
		return sum;
	}

}
