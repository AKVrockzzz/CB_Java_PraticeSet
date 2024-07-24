package Assignment_6_Recursion;

import java.util.Scanner;

public class Recursion_Lexicographical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int curr = 0;
		Print(N, curr);
	}

	public static void Print(int n, int curr) {
		// TODO Auto-generated method stub
		if( curr > n ) return;
		
		System.out.print(curr + " ");
		int i = 0;
		if (curr == 0) i = 1;		
		for(; i <= 9; i++) {
			Print(n, curr * 10 + i);
		}
	}

}
