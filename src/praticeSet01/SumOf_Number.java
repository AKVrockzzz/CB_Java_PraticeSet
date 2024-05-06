package praticeSet01;
import java.util.*;
public class SumOf_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		int i=1;
		int sum=0;
		
		while(i<=num) {
			sum += i;
			i++;
		}
		System.out.println("Sum of Number is: " + sum);
	}
}
