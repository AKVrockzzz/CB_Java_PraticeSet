package praticeSet04_Array;

public class Average_Value_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{20, 30, 25, 35, -16, 60, -100};
		System.out.print(averageOfArray(arr));
	}
	
	public static int averageOfArray(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		int avg = sum/n;
		return avg;
	}

}
