package assignment04_2DArray_Binary_Search;

import java.util.Scanner;

public class Arrays_Spiral_Print_Anticlockwise {

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
		PrintAnticlockwise(arr,N,M);
	}

	public static void PrintAnticlockwise(int[][] arr, int N, int M) {
		// TODO Auto-generated method stub
		int minr = 0, minc = 0, c = 0;
		int maxr = N-1, maxc = M-1;
		int te = N * M;
		while(c < te) {
			for(int i=minr; i<=maxr && c < te; i++) {
				System.out.print(arr[i][minc] +", ");
				c++;
			}
			minc++;
			for(int i=minc; i<=maxc && c<te; i++) {
				System.out.print(arr[maxr][i] + ", ");
				c++;
			}
			maxr--;
			for(int i=maxr; i>=minr && c<te; i--) {
				System.out.print(arr[i][maxc] + ", ");
				c++;
			}
			maxc--;
			for(int i=maxc; i>=minc && c<te; i--) {
				System.out.print(arr[minr][i] + ", ");
				c++;
			}
			minr++;
		}
		System.out.print("END");
	}

}
