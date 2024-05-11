package practiceSet02;
import java.util.*;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Number of Rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=num;
		int space=num-1;
		//Row Create
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
			star--;
			space--;
		}
		//Reverse Pattern Loop
		while(row-2>=1) {
			//Space
			int i=1;
			while(i<=space+2) {
				System.out.print("  ");
				i++;
			}
			//star
			int j=1;
			while(j<=star+2) {
				System.out.print("* ");
				j++;
			}
			//Row Update
			System.out.println();
			row--;
			star++;
			space++;
		}
	}

}
