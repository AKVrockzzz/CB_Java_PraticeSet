package Assignment_6_Recursion;

import java.util.Scanner;

public class Mazepath_D_Count_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int currVer = 0, currHor = 0;
		
		System.out.println("\n" + Print_Count(N,M,currVer,currHor,""));
	}

	public static int Print_Count(int n, int m, int currVer, int currHor, String ans) {
		// TODO Auto-generated method stub
		if(currVer > n-1 || currHor > m-1) return 0;
		
		if(currVer == n-1 && currHor == m-1) {
			System.out.print(ans + " ");
			return 1;
		}
		
		int count = 0;
		// Move Verticle
		count += Print_Count(n, m, currVer + 1, currHor, ans + "V");
		// Move Horizontal
		count += Print_Count(n, m, currVer , currHor + 1, ans + "H");
		//Move Diagonal
		count += Print_Count(n, m, currVer + 1, currHor + 1, ans + "D" );
		
		return count;
	}

}
