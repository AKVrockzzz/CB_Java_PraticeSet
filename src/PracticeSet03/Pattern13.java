package PracticeSet03;
import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Number of Rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=1;
		//Row Create
		while(row<=num*2-1) {
			//Star
			int i=1;
			while(i<=star) {
			System.out.print("* ");
			i++;
			}
			//Mirroring
			if(row<num) {
				star++;
			}
			else {
				star--;
			}
			//Row Update
			row++;
			System.out.println();
		}
	}

}
