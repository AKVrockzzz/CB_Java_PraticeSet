package RevisionSet_MySheet;
import java.util.*;
public class Target_Sum_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		Arrays.sort(arr);
		Pair(arr,item);
	}
	public static void Pair(int[] arr, int item) {
		int i = 0;
		int j = arr.length-1;
		while( i < j ) {
			int sum = arr[i] + arr[j];
			if(item == sum) {
				System.out.println(arr[i] + " and " + arr[j]);
				i++;
				j--;
			}
			else if(sum > item) j--;
			else i++;
		}
	}

}
