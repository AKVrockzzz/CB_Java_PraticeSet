package practiceSet02;
import java.util.*;
public class Pattern02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Total Number of Rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=1;
		//Rows
		while(row<=num) {
			//Stars 
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			star++;
		}

	}

}
