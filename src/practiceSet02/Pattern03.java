package practiceSet02;
import java.util.*;
public class Pattern03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Total Number of Rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=num;
		//Row 
		while(row<=num) {
			//Star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//Row Update
			System.out.println();
			row++;
			star--;
		}

	}

}
