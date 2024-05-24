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
		int turn = 1;
		int ayushTotal = 0;
		int harshitTotal = 0;
		
		while(true) {
			if(turn % 2 != 0) {
				ayushTotal += turn;
				if(ayushTotal > M) {
					System.out.println("Harshit");
					break;
				}
			}
			else {
				harshitTotal += turn;
				if(harshitTotal > N) {
					System.out.println("Aayush");
					break;
				}
			}
			turn++;
			
		}
	}

}
