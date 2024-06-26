package RevisionSet_MySheet;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int[] stall = new int[nos];
		for(int i=0; i<nos; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(Largets_Minimum_Distance(stall,nos,noc));
	}

	public static int Largets_Minimum_Distance(int[] stall, int nos, int noc) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = stall[stall.length-1] - stall[0];
		int ans = 0;
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			if(isPossible(stall,nos,noc,mid) == true) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid - 1;
			}
		}
		return ans;
	}

	public static boolean isPossible(int[] stall,int nos, int noc, int mid) {
		// TODO Auto-generated method stub
		int cow = 1;
		int lastSum = stall[0];
		for(int i=1; i<nos; i++) {
			if(stall[i] - lastSum >= mid) {
				cow++;
				lastSum = stall[i];
				if(cow == noc) {
					return true;
				}
			}
		}
		return false;
	}

}
