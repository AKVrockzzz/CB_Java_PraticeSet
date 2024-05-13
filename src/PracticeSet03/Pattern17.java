package PracticeSet03;
import java.util.*;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Number or row: ");
		int num = sc.nextInt();
		int row=1;
		int star=num/2;
		int space=1;
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
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			//Mirroring
			if(row<=num/2) {
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
