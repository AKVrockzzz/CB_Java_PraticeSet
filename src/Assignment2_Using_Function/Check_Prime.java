package Assignment2_Using_Function;
import java.util.*;
public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		checkPrime(num);
	}
	
	public static void checkPrime(int n) {
		int count = 0;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>=1) {
			System.out.print("Not Prime");
		}
		else {
			System.out.print("Prime");
		}
		
	}

}
