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
		System.out.println(MajorityElement(arr));
	}
	public static int MajorityElement(int[] arr) {
		int element;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count++;
		}
		
		element = count / 2;
		return element;
	}

}
