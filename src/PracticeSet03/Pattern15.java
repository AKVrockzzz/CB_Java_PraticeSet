package PracticeSet03;
import java.util.*;
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Number of Rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=num;
		int space=0;
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
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			//Row Update
			row++;
			System.out.println();
		}
	}

}
