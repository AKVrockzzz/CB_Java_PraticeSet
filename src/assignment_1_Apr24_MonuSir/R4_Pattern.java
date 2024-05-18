package assignment_1_Apr24_MonuSir;
import java.util.*;
public class R4_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1;
		int star = 1;
		//Row Create
		while(row<=num) {
			//Star
			int i = 1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			//Row Update
			row++;
			star++;
			System.out.println();
		}
	}

}
