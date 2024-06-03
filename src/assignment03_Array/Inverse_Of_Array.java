package assignment03_Array;
import java.util.*;
public class Inverse_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] inv = Inverse(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(inv[i] + " ");
		}
	}
	
	public static int[] Inverse(int[] arr) {
		int[] inv = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int j = arr[i];
			inv[j] = i;
		}
		return inv;
	}

}
