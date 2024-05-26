package praticeSet04_Array;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,8,13,35,12,43};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Reverse(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Reverse(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
