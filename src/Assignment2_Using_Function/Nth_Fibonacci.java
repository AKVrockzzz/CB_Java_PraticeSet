package Assignment2_Using_Function;
import java.util.*;
public class Nth_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fibonacciNumber(num));
	}
	
	public static int fibonacciNumber(int num) {
		int a=0,b=1;
		int fibonacci = 0;
		for(int i=1; i<=num; i++) {
			fibonacci = a+b;
			a=b;
			b=fibonacci;
		}
		return a;
	}

}
