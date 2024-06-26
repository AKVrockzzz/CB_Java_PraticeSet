package RevisionSet_MySheet;

import java.util.Arrays;
import java.util.Scanner;

public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nob = sc.nextInt();
		int nos = sc.nextInt();
		int[] page = new int[nob];
		for(int i=0; i<nob; i++) {
			page[i] = sc.nextInt();
		}
		Arrays.sort(page);
		System.out.println(Largest_Minimum(page,nob,nos));
	}

	public static int Largest_Minimum(int[] page, int nob, int nos) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = 0;
		int ans = 0;
		for(int i=0; i<nob; i++) {
			hi += page[i];
		}
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			if(isPossible(page,nos,mid) == true) {
				ans = mid;
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		return ans;
	}

	public static boolean isPossible(int[] page, int nos, int mid) {
		// TODO Auto-generated method stub
		int std = 1;
		int readPage = 0;
		for(int i=0; i<page.length;) {
			if(readPage + page[i] <= mid) {
				readPage += page[i];
				i++;
			}
			else {
				readPage = 0;
				std++;
			}
			if(std > nos) return false;
		}
		return true;
	}

}
