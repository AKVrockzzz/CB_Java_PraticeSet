package assignment03_Array;
import java.util.*;
public class Calculate_The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int Q = sc.nextInt(); // No. of operation
		for(int j=0; j<Q; j++) {
			int X = sc.nextInt();
			arr = Sum(arr, X, N);
		}
		int sum = 0;
		for(int k=0; k<arr.length; k++) {
			sum = sum + arr[k];
			
		}
		System.out.println(sum);
	}
	
	public static int[] Sum(int[] arr, int X, int N) {
		int[] temp = new int[arr.length];
		for(int i=0; i< temp.length; i++) {
			temp[i] = arr[i] + arr[(i-X+N)%N];
		}
		
		return temp;
	}

}
