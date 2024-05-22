package Assignment2_Using_Function;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); //Read number 1 value
		int n2 = sc.nextInt(); // Read number 2 value
		System.out.println(LCM(n1,n2));
	}
	
	public static int LCM(int n1, int n2) {
		int a = n1;
		int b = n2;
		while(n2!=0) {
			int temp = n2;
			n2 = n1%n2;
			n1 = temp;
		} // Calculate GCD of n1 & n2
		int lcm = (a*b)/n1; // LCM = (a*b)/GCD(a,b)
		
		return lcm;
	}

}
