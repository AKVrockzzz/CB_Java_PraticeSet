package practiceSet02;
import java.util.*;
public class Pattern05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Number of Rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=num;
		int space=0;
		//Row
		while(row<=num) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//Star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
			space++;
			star--;
		}

	}

}
