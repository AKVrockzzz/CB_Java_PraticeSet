package PracticeSet03;
import java.util.*;
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Total number of rows: ");
		int num = sc.nextInt();
		int row=1; 
		int star=1;
		int space=num*2-3;
		//Row Create
		while(row<=num) {
			//Star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//Space
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			//Star
			int k=1;
			if(row==num) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			//Row Update
			row++;
			star++;
			space-=2;
			System.out.println();
		}
	}

}
