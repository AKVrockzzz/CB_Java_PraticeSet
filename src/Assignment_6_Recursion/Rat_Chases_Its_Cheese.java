package Assignment_6_Recursion;

import java.util.Scanner;

public class Rat_Chases_Its_Cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] maze =  new char[N][M];
		for(int i=0; i<maze.length; i++) {
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[N][M];
		MazePath(maze, 0, 0, ans);
		if( val == false) {
			System.out.println("NO PATH FOUND");
		}
	}
	static boolean val = false;
	public static void MazePath(char[][] maze, int cr, int cc, int[][] ans) {
		
		if(cr<0 || cr>=maze.length || cc<0 || cc>=maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		if(cr == maze.length-1 && cc == maze[0].length-1) {
			ans[cr][cc] = 1;
			val  = true;
			Display(ans);
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		MazePath(maze, cr-1, cc, ans); // Up
		MazePath(maze, cr, cc-1, ans); // Left
		MazePath(maze, cr+1, cc, ans); // Down
		MazePath(maze, cr, cc+1, ans); // Right
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for(int i=0; i<ans.length; i++) {
			for(int j=0; j<ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
