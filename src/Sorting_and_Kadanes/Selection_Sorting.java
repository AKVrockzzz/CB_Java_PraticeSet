package Sorting_and_Kadanes;

public class Selection_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {64,25,12,22,11};
		selectionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int idx = miniIndex(arr,i);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}
	public static int miniIndex(int[] arr, int i) {
		int minidx = i;
		for(int j=i+1; j<arr.length; j++) {
			if(arr[j]<arr[minidx]) {
				minidx = j;
			}
		}
		return minidx;
	}

}
