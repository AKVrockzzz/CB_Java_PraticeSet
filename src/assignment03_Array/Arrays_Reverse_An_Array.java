package assignment03_Array;
import java.util.*;
public class Arrays_Reverse_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] rev = Reversed_Array(arr);
		for(int i=0; i<rev.length; i++) {
			System.out.println(rev[i]);
		}
	}

	public static int[] Reversed_Array(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
			i++;
		}
		return arr;
	}

}
