package praticeSet04_Array;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,8,13,35,12,43};
		int item = 12;
		System.out.println(displayIndex(arr,item));
	}
	
	public static int displayIndex(int[] arr,int item) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
