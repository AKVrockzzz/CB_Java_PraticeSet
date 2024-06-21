package assignment04_2DArray_Binary_Search;
import java.util.*;
public class Transpose_Of_A_Square_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Transpose(arr);
	}
	public static void Transpose(int[][] arr) {
		for(int col=0; col<arr[0].length; col++) {
			for(int row=0; row<arr.length; row++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
