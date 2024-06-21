package praticeSet_05_2D_Array;
import java.util.*;
public class Verticle_Wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(); // Row
		int col = sc.nextInt(); // Col
		int[][] arr = new int[row][col];
		//Input
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Print(arr);
	}
	public static void Print(int[][] arr) {
		for(int col=0; col<arr[0].length; col++) {
			if(col % 2 == 0) {
				for(int row=0; row<arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			}
			else {
				for(int row=arr.length-1; row>=0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
			System.out.println();
		}
	}

}
