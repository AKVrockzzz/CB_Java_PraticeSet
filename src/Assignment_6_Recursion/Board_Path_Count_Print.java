package Assignment_6_Recursion;

import java.util.Scanner;

public class Board_Path_Count_Print {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // Size of Snake and Ladder
		int M = sc.nextInt(); // Face of Dice
		
		System.out.println("\n" + Print(N, M, 0, ""));
	}

	public static int Print(int endCoin, int m, int currCoin, String ans) {
		// TODO Auto-generated method stub
		
		if(currCoin >  endCoin) return 0;
		
		if(currCoin == endCoin) {
			System.out.print(ans + " ");
			return 1;
		}
		
		int count = 0;
		for(int dice = 1; dice <= m; dice++) {
			count += Print(endCoin, m, currCoin + dice, ans + dice);
		}
		
		return count;
	}
}
