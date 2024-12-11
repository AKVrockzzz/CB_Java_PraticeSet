package DP_Part_1;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,9,3,1};
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(Robber(arr,0));
		System.out.println(RobberTD(arr,0, dp));
	}
	
	public static int RobberTD(int[] arr, int i, int[] dp) {
		if(i >= arr.length) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + RobberTD(arr, i+2, dp);
		int Dont_rob = RobberTD(arr, i+1, dp);
		return dp[i] = Math.max(rob, Dont_rob);
	}
	
	public static int Robber(int[] arr, int i) {
		if(i >= arr.length) {
			return 0;
		}
		
		int rob = arr[i] + Robber(arr, i+2);
		int Dont_rob = Robber(arr, i+1);
		return Math.max(rob, Dont_rob);
	}

}
