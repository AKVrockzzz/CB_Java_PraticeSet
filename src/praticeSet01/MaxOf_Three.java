package praticeSet01;
import java.util.*;
public class MaxOf_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int b = sc.nextInt();
		System.out.print("Enter Number 3: ");
		int c = sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("a is Max");
		}
		else if(b>=a && b>=c) {
			System.out.println("b is Max");
		}
		else {
			System.out.println("c is Max");
		}
	}

}
