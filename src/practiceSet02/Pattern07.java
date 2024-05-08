package practiceSet02;
import java.util.*;
public class Pattern07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number or row: ");
		int num = sc.nextInt();
		int row=1;
		int star=num;
		//Create Row
		while(row<=num) {
			//Star
			int col=1;
			while(col<=star) {
				if(row==1 || row==star || col==1 || col==star) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				col++;
			}
			//Row Update
			System.out.println();
			row++;
		}

	}

}
