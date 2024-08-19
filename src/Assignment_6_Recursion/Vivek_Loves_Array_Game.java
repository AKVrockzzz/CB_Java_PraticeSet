package Assignment_6_Recursion;
import java.util.*;
public class Vivek_Loves_Array_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int N = sc.nextInt(); //Size of array
			int[] arr = new int[N];
			for(int j=0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println(Score(arr, 0, N-1));
		}
	}

	public static int Score(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		// Base case: If the array has less than 2 elements, no split is possible
		if(start >= end) return 0;
		
		// Calculate the total sum of the current subarray
		int totalSum = 0;
		int leftSum = 0;
		for(int i=start; i<=end; i++) {
			totalSum += arr[i];
		}
		
		// Try to find a split point where the left and right sums are equal
		for(int i=start; i<end; i++) {
			leftSum += arr[i];
			int rightSum = totalSum - leftSum;
			
			if(leftSum == rightSum) {
				// If we found a valid split, recursively calculate the score for both parts
				int leftScore = Score(arr, start, i);
				int rightScore = Score(arr, i+1, end);
				return 1 + Math.max(leftScore, rightScore);
			}
		}
		return 0; // If split is not possible
	}

}
