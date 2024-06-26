package assignment04_2DArray_Binary_Search;

import java.util.Scanner;

public class Find_Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		System.out.println(Sqrt(A));
	}

	public static int Sqrt(int a) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = a;
		int ans = 0;
		if(a == 1 || a == 0) return a;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
            long midSquared = (long) mid * mid;
			if(midSquared == a) {
				return mid;
			}
			else if (midSquared < a) {
				ans = mid;
				lo = mid + 1;
			}
			else {
				hi = mid - 1;
			}
		}
		return ans;
	}

}
