package Assignment2_Using_Function;
import java.util.*;
public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		printTermSeries(n1,n2);
	}
	
	public static void printTermSeries(int n1, int n2) {
		int count = 0;
		int n = 1;
		while(count<n1) {
			int terms = 3*n+2;
			if(terms%n2!=0) {
				System.out.println(terms);
				count++;
			}
			n++;
		}
	}

}
