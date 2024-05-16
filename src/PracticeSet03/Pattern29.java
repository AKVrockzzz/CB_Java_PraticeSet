package PracticeSet03;
import java.util.*;
public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Number of Rows: ");
		int num = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = num-1;
		int count = 1;
		//Row Create
		while(row<=num) {
			//Space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//Star
			int j = 1;
			while(j<=star) {
				
				if(j==1 || j==star) {
					System.out.print(count + " ");	
				}
				else {
					System.out.print("0 ");
				}
				j++;
			}
			//Row Update
			row++;
			count++;
			star+=2;
			space--;
			System.out.println();
		}
	}

}
