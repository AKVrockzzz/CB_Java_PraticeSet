package RevisionSet_MySheet;
import java.util.*;
public class Max_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Max(arr));
	}
	public static int Max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}

}
