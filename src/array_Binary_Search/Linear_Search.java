package array_Binary_Search;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 50, 30, 40, 20};
		int key = 30;
		System.out.println(Target_Search(arr, key));
	}
	public static boolean Target_Search(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if( arr[i] == target ) {
				return true;
			}
		}
		return false;
	}

}
