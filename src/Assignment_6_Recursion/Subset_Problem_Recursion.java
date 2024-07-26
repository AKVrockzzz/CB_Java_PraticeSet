package Assignment_6_Recursion;
import java.util.*;
public class Subset_Problem_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		
		System.out.println("\n" + Subset(arr, 0, target, ""));
	}

	public static int Subset(int[] arr, int i, int target, String set) {
		// TODO Auto-generated method stub
		if(i == arr.length) {
			if(target == 0) {
				System.out.print(set);
				return 1;
			}
			return 0 ;
		}
		
		int count = 0;
		//Pick Value from array
		count += Subset(arr, i + 1, target - arr[i], set + arr[i] + " ");
		
		//Not Pick Value from array
		count += Subset(arr, i + 1, target, set);
		return count;
	}

}
