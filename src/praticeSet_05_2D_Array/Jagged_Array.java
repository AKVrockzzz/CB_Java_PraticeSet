package praticeSet_05_2D_Array;
import java.util.*;
public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Row
		int[][] arr = new int[n][];
		//Input
		for(int i=0; i<arr.length; i++) {
			int m = sc.nextInt();
			arr[i] = new int[m];
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//Output
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
