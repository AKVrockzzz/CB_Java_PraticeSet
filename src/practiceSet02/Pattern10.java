package practiceSet02;
import java.util.*;
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of row: ");
		int num = sc.nextInt();
		int row=1;
		int star= (num*2)-1;
		int space=0;
		//Create Row
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
				System.out.print("* ");
				j++;
			}
			//Row Update
			System.out.println();
			row++;
			space++;
			star-=2;
		}
	}

}
