package Assignment2_Using_Function;
import java.util.*;
public class Binary_ToDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		System.out.println(BinaryToDigit(num));
	}
	
	public static int BinaryToDigit(int n) {
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			mul = mul * 2;
			n /= 10;
		}
		return sum;
	}

}
