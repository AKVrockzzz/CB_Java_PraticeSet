package Assignment_6_Recursion;
import java.util.*;
public class Odd_Even_Using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		printOdd(N);
		printEven(2, N);
	}

	public static void printOdd(int n) {
		// TODO Auto-generated method stub
		if(n <= 0) return;
		if(n % 2 != 0) System.out.println(n);
		printOdd(n - 1);
	}
	
	public static void printEven(int start, int N) {
		if(start > N) return;
		
		if(start % 2 == 0) {
			System.out.println(start);
		}
		
		printEven(start + 1, N);
	}

}
