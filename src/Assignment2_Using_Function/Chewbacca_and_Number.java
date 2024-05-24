package Assignment2_Using_Function;
import java.util.*;
public class Chewbacca_and_Number {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long result = transformNumber(x);
        System.out.println(result);
    }
	
	public static long transformNumber(long x) {
		long num = reverseNumber(x);
		long result = 0;
		boolean isFirstDigit = true;
		
		while(num>0) {
			long digit = num%10;
			num/=10;
			long invertableNumber = 9 - digit;
			
			if(isFirstDigit) {
				if(invertableNumber != 0 && invertableNumber < digit) {
					digit = invertableNumber;
				}
				isFirstDigit = false;
			}else {
				if(invertableNumber < digit) {
					digit = invertableNumber;
				}
			}
			result = result * 10 + digit;
		}
		return result;
	}
	
	public static long reverseNumber(long x) {
		long sum = 0;
		while(x>0) {
			int rem =(int) x%10;
			sum = sum * 10 + rem;
			x/=10;
		}
		return sum;
	}
}



