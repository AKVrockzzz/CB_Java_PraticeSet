package assignment04_2DArray_Binary_Search;

import java.util.Scanner;

public class KTH_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //test Cases
		for(int i=0; i<T; i++) {
			long N = sc.nextLong();
			long K = sc.nextLong();
			System.out.println(KthRoot(N,K));
		}
	}

	public static int KthRoot(long n, long k) {
		// TODO Auto-generated method stub
		long ans = 0;
		long lo=0;
		long hi=n;
		while(lo <= hi) {
			long mid = (lo+hi)/2;
			if(Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid+1;
			}
			else hi = mid - 1;
		}
		return (int)ans;
	}

}
