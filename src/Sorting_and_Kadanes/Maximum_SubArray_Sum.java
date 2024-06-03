package Sorting_and_Kadanes;

public class Maximum_SubArray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(SubArray_Sum(arr));
	}

	public static int SubArray_Sum(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		int n = arr.length;
		for(int i=0; i<n; i++) {
			sum += arr[i];
			ans = Math.max(ans,sum);
			if(sum<0) {
				sum = 0;
			}
		}
		return ans;
	}

}
