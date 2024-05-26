package Assignment2_Using_Function;
import java.util.*;
public class Shoping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1; i<=t; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			
			gameWinners(M,N);
		}
	}
	
	public static void gameWinners(int M, int N) {
		if(M>=N) {
			System.out.println("Ayush");
		}
		else {
			System.out.println("Harshit");
		}
	}

}
