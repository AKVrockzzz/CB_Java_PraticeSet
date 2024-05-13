package PracticeSet03;
import java.util.*;
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Number of Row: ");
		int num = sc.nextInt();
		int row=1;
		int star=1;
		int space=(num/2);
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
				if(j==1 || j==star) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				j++;
			}
			//Mirroring
			if(row<=num/2) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			//Row Update
			row++;
			System.out.println();
		}
	}

}
