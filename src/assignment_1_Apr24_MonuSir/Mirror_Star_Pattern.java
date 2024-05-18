package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Mirror_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = num/2;
		if (num % 2 == 0 || num <= 0 || num >= 10) {
            System.out.println("Invalid input. N must be an odd number between 0 and 10.");
            return;
        }
		//Row Create
		while(row<=num) {
			//Space
			int i = 1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			//Star
			int j = 1;
			while(j<=star) {
				System.out.print("*");
				if (j < star) { // Don't print a tab after the last star
                    System.out.print("\t");
                }
				j++;
			}
			//Mirror
			if(row<=num/2) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			//Row Update
			row++;
			System.out.println();
		}
	}

}
