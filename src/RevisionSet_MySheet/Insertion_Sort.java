package RevisionSet_MySheet;
import java.util.*;
public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Sort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			insertLastElement(arr,i);
		}
	}
	public static void insertLastElement(int[] arr, int i) {
		int item = arr[i];
		int j = i-1;
		while(j>=0 && arr[j] > item) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = item;
	}

}
