package Assignment2_Using_Function;
import java.util.*;
import java.math.*;;
public class Print_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		printArmstrongNumbers(num1, num2);
	}
	
	public static void printArmstrongNumbers(int N1,int N2){
		for(int i=N1; i<=N2; i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isArmstrong(int i) {
		int orginalNumber = i;
		int pow = countOfDigit(i);
		int sum = 0;
		while(i>0){
			int lastDigit = i%10;
			sum = (int)(sum + Math.pow(lastDigit, pow));
			i/=10;
		}
		return sum==orginalNumber;
	}
	
	public static int countOfDigit(int n) {
		int c = 0;
		while(n>0) {
			n = n/10;
			c++;
		}
		return c;
	}

}
