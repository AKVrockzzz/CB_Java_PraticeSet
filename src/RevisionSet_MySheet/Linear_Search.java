package RevisionSet_MySheet;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt(); // target item
		System.out.println(Search(arr, key));
	}
	public static int Search(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) return i;
		}
		return -1;
	}
}
