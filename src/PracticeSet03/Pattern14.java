package PracticeSet03;
import java.util.*;
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Number of rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=1;
		int space=num-1;
		//Row Create
		while(row<=num*2-1) {
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
			//Mirroring
			if(row<num) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			//Row update
			row++;
			System.out.println();
		}
	}

}
