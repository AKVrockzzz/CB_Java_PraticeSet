package assignment03_Array;
import java.util.*;
public class Maximum_Sum_Path_In_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr1 = new int[N];
			int[] arr2 = new int[M];
			
			for(int j=0; j<N; j++) {
				arr1[j] = sc.nextInt();
			}
			for(int k=0; k<M; k++) {
				arr2[k] = sc.nextInt();
			}
			System.out.println(Maximum_Sum(arr1,arr2));
		}
	}

	public static int Maximum_Sum(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int i=0; 
		int j=0;
		int sum1 = 0;
		int sum2 = 0;
		int maxSum = 0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i++;
			}
			else if(arr1[i] > arr2[j]) {
				sum2 = sum2 + arr2[j];
				j++;
			}
			else {
				maxSum += Math.max(sum1, sum2) + arr1[i];
				sum2 = 0;
				sum1 = 0;
				i++;
				j++;
			}
		}
		while(i < arr1.length) {
			sum1 = sum1 + arr1[i];
			i++;
		}
		while(j < arr2.length) {
			sum2 = sum2 + arr2[j];
			j++;
		}
		maxSum += Math.max(sum1, sum2);
		return maxSum;
	}

}
