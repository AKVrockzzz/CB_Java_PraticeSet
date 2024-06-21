package assignment04_2DArray_Binary_Search;
import java.util.*;
public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //Row
		int[][] arr = new int[N][N];
		//Input
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Print(arr);
	}
	public static void Print(int[][] matrix) {
		for(int col=matrix[0].length-1; col>=0; col--) {
			for(int row=0; row<matrix.length; row++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

}
