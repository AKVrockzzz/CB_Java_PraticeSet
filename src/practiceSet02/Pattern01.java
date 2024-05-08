package practiceSet02;
import java.util.*;
public class Pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of TotalRows: ");
		int totalRows = sc.nextInt();
		System.out.print("Enter the Number of Stars: ");
		int star = sc.nextInt();
		int row=1;
		//Rows
		while(row<=totalRows) {
			//Stars
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
		}
		

	}

}
