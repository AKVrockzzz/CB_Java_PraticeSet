package Test;

public class Rotate_Array_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k = 10;
		Rotate(arr,k);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		//ROtate (0 , n-1)
		Reverse(arr, 0, n-1);
		
		//Rotate (0, k-1)
		Reverse(arr, 0, k-1);
		
		//Reverse (k, n-1)
		Reverse(arr, k, n-1);
		
		return arr;
		
	}
	
	public static int[] Reverse(int[]arr, int i, int j) {
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++; 
			j--;
		}
		return arr;
	}

}
