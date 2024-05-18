package PracticeSet03;
import java.util.*;
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Number of Rows: ");
		int num = sc.nextInt();
		int row = 1;
		int star = num;
		//Row Create
		while(row<=num) {
			//Star
			int i = 1;
			int count = num;
			while(i<=star) {
				System.out.print(count + " ");
				count--;
				i++;
			}
			//Row Update
			row++;
			System.out.println();
		}
	}

}
