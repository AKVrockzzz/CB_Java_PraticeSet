package Sorting_and_Kadanes;

public class Insertion_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,1,10,5,2};
		insertionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			insertLastElement(arr,i);
		}
	}

	public static void insertLastElement(int[] arr, int i) {
		// TODO Auto-generated method stub
		int item = arr[i];
		int j = i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = item;
	}

}
