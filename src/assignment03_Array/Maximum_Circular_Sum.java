package assignment03_Array;
import java.util.*;
public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //No. of test cases
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int j=0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println(Sum(arr));
		}
	}
	public static int Sum(int[] arr) {
		int maxKadanes = Maximum_Sum(arr);
		int totalSum = 0;
		for(int i=0; i<arr.length; i++) {
			totalSum += arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = -arr[i];
		}
		
		int maxInvertedKadane = Maximum_Sum(arr);
		int maxCircular = totalSum + maxInvertedKadane;
		
		if(maxCircular == 0) return maxCircular;
		return Math.max(maxKadanes, maxCircular);
	}
	public static int Maximum_Sum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		int n = arr.length;
		for(int i=0; i<n; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if(sum < 0) sum=0;
		}
		return ans;
	}

}
