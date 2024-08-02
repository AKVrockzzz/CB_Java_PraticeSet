package Assignment_6_Recursion;

import java.util.Scanner;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		TOH(N, "A", "C", "B");
		
	}
	public static void TOH(int n, String src, String hlp, String des) {
		if(n == 0) return;
		TOH(n - 1, src, des, hlp);
		System.out.println("Moving ring " + n + " from " + src + " to " + des);
		TOH(n - 1, hlp, src, des);
	}

}
