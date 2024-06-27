package assignment04_2DArray_Binary_Search;
import java.util.*;
public class Column_With_Maximum_Sum_In_A_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Maximum(arr,N);
	}

	public static void Maximum(int[][] arr, int N) {
		// TODO Auto-generated method stub
		int[] colSum = new int[N];
		int ans = Integer.MIN_VALUE;
		int sum=0;
		for(int col=0; col<arr[0].length; col++) {
			for(int row=0; row<arr.length; row++) {
				colSum[col] += arr[row][col]; 
			}
		}
		int maxSum = 0;
		int maxIndex = 0;
		for(int i=0; i<N; i++) {
			if(colSum[i] > maxSum) {
				maxSum = colSum[i];
				maxIndex = i;
			}
		}
		System.out.println((maxIndex + 1) + " " + maxSum);
	}

}
