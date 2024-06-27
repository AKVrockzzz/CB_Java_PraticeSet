package assignment04_2DArray_Binary_Search;
import java.util.*;
public class A_Boolean_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); // row
		int N = sc.nextInt(); // Col
		int[][] arr = new int[M][N];
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		modifyMatrix(arr,M,N);
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void modifyMatrix(int[][] arr, int M, int N) {
		// TODO Auto-generated method stub
		boolean[] row = new boolean[M];
		boolean[] col = new boolean[N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i][j] == 1) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(row[i] || col[j]) arr[i][j] = 1;
			}
		}
	}

}
