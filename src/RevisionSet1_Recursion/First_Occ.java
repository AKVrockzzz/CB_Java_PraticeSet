package RevisionSet1_Recursion;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,7,8};
		int item = 8;
		System.out.println(Index(arr,item,0));
	}
	public static int Index(int[] arr, int item, int i) {
		if(i == arr.length) return -1;
		if(arr[i] == item)return i;
		return Index(arr,item,i+1);
		
		
	}

}
