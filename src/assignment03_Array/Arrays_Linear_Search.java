package assignment03_Array;
import java.util.*;
public class Arrays_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
//		int M = 17;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		
		System.out.println(Target_Search(arr,M));
	}

	public static int Target_Search(int[] arr, int target) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
