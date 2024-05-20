package Assignment2_Using_Function;
import java.util.*;
import java.math.*;
public class InverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(Inverse(num));
	}
	
	public static int Inverse(int n) {
		int sum = 0;
		int pos = 1;
		while(n>0) {
			int rem = n % 10;
			sum = sum + pos * (int)(Math.pow(10, rem-1));
			n /= 10;
			pos++;
		}
		return sum;
	}

}
