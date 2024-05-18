package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Pattern_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1;
		int star = num;
		int space = -1;
		//Row Create
		while(row<=2*num-1) {
			//Star
			int i = 1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			//Space
			int j = 1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			//Star
			int k = 1;
			if(row==1 || row==num*2-1) {
				k = 2;
			}
			while(k<=star) {
				System.out.print("*");
				k++;
			}
			//Mirror
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
