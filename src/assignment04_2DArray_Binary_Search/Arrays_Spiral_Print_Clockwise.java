package assignment04_2DArray_Binary_Search;

import java.util.Scanner;

public class Arrays_Spiral_Print_Clockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Print__Clockwise(arr);
	}

	public static void Print__Clockwise(int[][] arr) {
		// TODO Auto-generated method stub
		int minr = 0, minc = 0;
		int maxr = arr.length-1, maxc = arr[0].length-1;
		int te = arr.length * arr.length;
		int c = 0;
		
		while(c < te) {
			for(int i=minc; i<=maxc && c<te; i++) {
				System.out.print(arr[minr][i] + ", ");
				c++;
			}
			minr++;
			for(int i=minr; i<=maxr && c<te; i++) {
				System.out.print(arr[i][maxc] + ", ");
				c++;
			}
			maxc--;
			for(int i=maxc; i>=minc && c<te; i--) {
				System.out.print(arr[maxr][i] + ", ");
				c++;
			}
			maxr--;
			for(int i=maxr; i>=minr && c<te; i--) {
				System.out.print(arr[i][minc] + ", ");
				c++;
			}
			minc++;
		}
		System.out.println("END");
	}

}
