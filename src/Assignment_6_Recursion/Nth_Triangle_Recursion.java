package Assignment_6_Recursion;

import java.util.Scanner;

public class Nth_Triangle_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Nth_Triangle(N));
	}

	public static int Nth_Triangle(int n) {
		// TODO Auto-generated method stub
		if(n == 0) return 0;
		
		int sum = Nth_Triangle(n-1);
		 
		 return sum + n;
	}

}
