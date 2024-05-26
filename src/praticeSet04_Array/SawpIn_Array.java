package praticeSet04_Array;

public class SawpIn_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,8,13,35,12,43};
		System.out.println(arr[0] + " and " + arr[7]);
		Swapping(arr,0, 7);
		System.out.println(arr[0] + " and " + arr[7]);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Swapping(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
