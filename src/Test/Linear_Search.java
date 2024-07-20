package Test;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,6,2,4,16,7,8,9};
		int target = 16;
		System.out.println(Search(arr, target));
	}

	public static int Search(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(int i : arr) {
			
			if(i == target) {
				return count;
			}
			count++;
		}
		return -1;
		
	}

}
