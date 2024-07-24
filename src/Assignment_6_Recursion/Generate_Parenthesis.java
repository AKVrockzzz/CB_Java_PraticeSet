package Assignment_6_Recursion;

import java.util.Scanner;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int open = 0;
		int close = 0;
		Generate(N, open, close, "");
	}

	public static void Generate(int n, int open, int close, String ans) {
		// TODO Auto-generated method stub
		if(open > n) return;
		if(close > open) return;
		
		if(open == n & close == n) {
			System.out.println(ans);
			return;
		}
		Generate(n, open, close + 1, ans + ")");
		Generate(n, open + 1, close, ans + "(");
	}

}
