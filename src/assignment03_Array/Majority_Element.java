package assignment03_Array;
import java.util.*;
public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int q = N/2;
		System.out.println(MajorityElement(arr,q));
	}
	public static int MajorityElement(int[] arr, int q) {
		int element = arr[0];
		int count = 1;
		for(int i=1; i<arr.length; i++) {
			if(element == arr[i]) count++;
			else {
				count--;
				if(count == 0) {
					element = arr[i];
					count++;
				}
			}
		}
		return element;
	}

}
