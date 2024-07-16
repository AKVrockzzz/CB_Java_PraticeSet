package RevisionSet02_Recursion;

public class Search_Item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,7};
		int item = 6;
		System.out.println(Search(arr,item,0));
	}

	private static int Search(int[] arr, int item, int i) {
		// TODO Auto-generated method stub
		if( arr[i] == item) return i;
		if( i == arr.length) return -1;
		
		return Search(arr, item, i+1);
		
		
	}

}
