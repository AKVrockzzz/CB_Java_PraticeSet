package assignment04_2DArray_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Rowwise_Sort_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Sort_RowWise(arr);
	}

	public static void Sort_RowWise(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
