package assignment04_2DArray_Binary_Search;

import java.util.*;
import java.util.Scanner;

public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //Number of shops
		int cows = sc.nextInt(); //Number of cows
		int[] stall = new int[N];
		for(int i=0; i<N; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(Minimum_Distance(stall,cows,N));
	}

	public static int Minimum_Distance(int[] stall, int c, int N) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = stall[stall.length-1] - stall[0];
		int ans = 0;
		while(lo <= hi) {
			int mid = (lo+hi)/2;
			if(isPossible(stall,c,N,mid) == true) {
				ans = mid;
				lo = mid + 1;
			}
			else hi = mid - 1;
		}
		return ans;
	}

	public static boolean isPossible(int[] stall, int c, int N, int mid) {
		// TODO Auto-generated method stub
		int count = 1;
		int lastDist = stall[0];
		for(int i=1; i<N; i++) {
			if(stall[i] - lastDist >= mid) {
				count++;
				lastDist = stall[i];
				if(count == c) {
					return true;
				}
			}
		}
		return false;
	}

}
