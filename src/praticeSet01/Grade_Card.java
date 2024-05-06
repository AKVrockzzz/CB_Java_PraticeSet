package praticeSet01;
import java.util.*;
public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Marks: ");
		int marks = sc.nextInt();
		
		if(marks>=75) {
			System.out.println("Grade A");
		}
		else if(marks>=65 && marks<75) {
			System.out.println("Grade B");
		}
		else if(marks>=55 && marks<65 ) {
			System.out.println("Grade C");
		}
		else if(marks>=45 && marks<55) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		

	}

}
