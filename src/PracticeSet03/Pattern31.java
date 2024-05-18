package PracticeSet03;
import java.util.*;
public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Number of Rows: ");
		int num = sc.nextInt();
		int row = 1;
		int star = 1;
		int count = 1;
		//Row Create
		while(row<=num*2-1) {
			//Star
			int i = 1;
			while(i<=star) {
				if(i%2==0) {
					System.out.print("* ");
				}
				else {
					System.out.print(count + " ");
				}
				i++;		
			}
			//Mirroring
			if(row<num) {
				count++;
				star+=2;
			}
			else {
				count--;
				star-=2;
			}
			//Row Update
			row++;
			System.out.println();
		}
	}

}
