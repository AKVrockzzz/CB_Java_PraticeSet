package assignment03_Array;
import java.util.*;
public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int j=0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			Permutation(arr);
			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
		}
	}
	public static int[] Permutation(int[] arr) {
		int n = arr.length;
		int k = n-2;
		
		//null check
		if(n==0 || arr==null)return arr;
		
		//find k
		for(int i=n-1; i>=0; i--) {
			if(arr[i] < arr[i-1]) k--;
			else {
				break;
			}
		}
		
		// if k==-1 then reverse
		if(k==-1) {
		Reverse(arr,0,n-1);
		return arr;
		}		
		// else replace k with next greater element reverse
		for(int i=n-1; i>0; i--) {
			if(arr[i] > arr[k]) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				break;
			}
		}
		
		Reverse(arr,k+1,n-1);
		return arr;
	}
	
	public static int[] Reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

}
