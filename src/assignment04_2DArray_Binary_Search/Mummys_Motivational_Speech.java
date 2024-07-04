package assignment04_2DArray_Binary_Search;

import java.util.Scanner;

public class Mummys_Motivational_Speech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Lower_Triangular(arr,N);
	}
	public static void Lower_Triangular(int[][] arr, int N) {
		//Transpose element upper diagonal digit with zero
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				arr[i][j] = 0;
			}
		}
		
		//Print Modify Matrix
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
