package assignment04_2DArray_Binary_Search;
import java.util.*;
public class Arrays_Wave_Print_Row_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //Row
		int M = sc.nextInt(); //Col
		int[][] arr = new int[N][M];
		//Input
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Print(arr);
	}
	public static void Print(int[][] arr) {
		for(int row=0; row<arr.length; row++) {
			if(row%2==0) {
				for(int col=0; col<arr[0].length; col++) {
					System.out.print(arr[row][col] + ", ");
				}
			}
			else {
				for(int col=arr[0].length-1; col>=0; col--) {
					System.out.print(arr[row][col] + ", ");
				}
			}
		}
		System.out.println("END");
	}

}
