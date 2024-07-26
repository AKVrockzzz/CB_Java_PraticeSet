package Assignment_6_Recursion;
import java.util.*;
public class First_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		System.out.println(Search(arr,0, M));		
	}

	public static int Search(int[] arr, int i, int m) {
		// TODO Auto-generated method stub
		if(i == arr.length) return -1;
		if(arr[i] == m) return 1;
		
		
		return Search(arr, i+1, m);
	}

}
