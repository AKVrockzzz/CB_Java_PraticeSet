package array_Binary_Search;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,6,7,9,11,13,17,18,19,20};
		int M = 13; 
		System.out.println(Target_Search(arr,M));
	}
	public static int Target_Search(int[] arr, int target) {
		int low = 0;
		int high = arr.length-1;
		while( low <= high ) {
			int mid = (low+high)/2;
			if( arr[mid] > target ) {
				high = mid-1;
			}else if( arr[mid] < target ) {
				low = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
