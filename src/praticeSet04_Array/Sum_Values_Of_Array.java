package praticeSet04_Array;

public class Sum_Values_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.print(sumOfArray(arr));;
	}
	
	public static int sumOfArray(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
