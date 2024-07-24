package Assignment_6_Recursion;

import java.util.Scanner;

public class Maze_Path_Count_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ver = 0, hor = 0;
		System.out.println("\n" + Print_Count(N, M, ver, hor, ""));
	}

	public static int Print_Count(int n, int m, int ver, int hor, String ans) {
		// TODO Auto-generated method stub
		
		if ( ver > n-1 || hor > m-1) return 0;
		
		if (ver == n-1 && hor == m-1) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		count += Print_Count(n, m, ver+1, hor, ans + "V");
		count += Print_Count(n, m, ver, hor+1, ans + "H");
		
		return count;
	}

}
