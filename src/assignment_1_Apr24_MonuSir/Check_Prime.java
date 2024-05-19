package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Check_Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number for check weather its Prime Number or Not: ");
		int num = sc.nextInt();
		int count = 0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}
}
