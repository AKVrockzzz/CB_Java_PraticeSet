package Assignment2_Using_Function;
import java.util.*;
import java.math.*;
public class IsArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(IsArmstrong(num));
	}
	
	public static boolean IsArmstrong(int n) {
		int sum = 0;
		int pow = countOfDigit(n);
		int num = n;
		
		while(n>0) {
			int lastDigit = n%10;
			sum=(int)(sum+(Math.pow(lastDigit, pow)));
			n/=10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int countOfDigit(int n) {
		int count = 0;
		while(n>0) {
			int rem = n%10;
			n/=10;
			count++;
		}
		return count;
	}

}
