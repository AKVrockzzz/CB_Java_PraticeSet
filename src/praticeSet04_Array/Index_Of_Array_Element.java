package praticeSet04_Array;

public class Index_Of_Array_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int item = 29;
		System.out.print(findIndex(arr,item));
	}
	
	public static int findIndex(int[] arr, int item) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
