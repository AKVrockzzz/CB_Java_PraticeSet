package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Hollow_Rhoumbus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1;
		int star = num;
		int space = num-1;
		//Row Create
		while(row<=num) {
			//Space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//Star
			int col = 1;
			while(col<=star) {
				if(row==1 || col==1 || row==star || col==star) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				col++;
			}
			//Row Update
			row++;
			space--;
			System.out.println();
		}
	}

}
