package praticeSet04_Array;

public class Maximux_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,8,13,35,8,54,23,12,54,86,32,11,34};
		System.out.println(maxInArray(arr));
	}
	
	public static int maxInArray(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}
