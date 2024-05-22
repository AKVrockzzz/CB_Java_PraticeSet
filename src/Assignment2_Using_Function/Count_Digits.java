package Assignment2_Using_Function;
import java.util.*;
public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //Read number
		int digit = sc.nextInt(); // Read Single digit for check dublicate digit in number
		System.out.println(countDigits(num,digit));
	}
	
	public static int countDigits(int num, int digit) {
		int count = 0;//Count Total Number of Dublicate Digit
		while(num>0) {
			int lastDigit = num%10;
			if(lastDigit == digit) {
				count++;
			}
			num/=10;
		}
		return count;
	}

}
