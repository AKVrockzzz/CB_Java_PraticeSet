package Assignment2_Using_Function;
import java.util.*;
public class Print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(ReverseDigit(num));
	}
	
	public static int ReverseDigit(int n) {
		int rev = 0;
		while(n>0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		return rev;
	}

}
