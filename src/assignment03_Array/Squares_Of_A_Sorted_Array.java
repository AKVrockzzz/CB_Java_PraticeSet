package assignment03_Array;
import java.util.*;
public class Squares_Of_A_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] squareArr = Square_Of_Array(arr);
		for(int i=0; i<squareArr.length; i++) {
			System.out.print(squareArr[i] + " ");
		}
	}

	public static int[] Square_Of_Array(int[] arr) {
		// TODO Auto-generated method stub
		int[] square = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			square[i] = arr[i] * arr[i];
		}
		Arrays.sort(square);
		return square;
	}
}
