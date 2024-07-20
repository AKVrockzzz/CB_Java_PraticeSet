package Test;

public class Max_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,5,6,2,4,16,7,8,9};
		System.out.println(Max(arr));
	}
	
	public static int Max(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
		
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}

}
