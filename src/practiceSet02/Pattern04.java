package practiceSet02;
import java.util.*;
public class Pattern04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Number of Rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=1;
		int space=num-1;
		//Row
		while(row<=num) {
			//Space
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
			//Row Update
			System.out.println();
			row++;
			space--;
			star++;
		}

	}

}
