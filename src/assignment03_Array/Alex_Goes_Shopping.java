package assignment03_Array;
import java.util.Scanner;
public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//No. of item
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt(); // no. of queries
		for(int i=1; i<=q; i++) {
			int A = sc.nextInt(); // alex's amount
			int K = sc.nextInt(); // minumum item purchase
			Shopping(arr,A,K);
		}
	}
	
	public static void Shopping(int[] arr, int A, int K) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(A% arr[i] == 0) count++;
		}
		if(count >= K) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
