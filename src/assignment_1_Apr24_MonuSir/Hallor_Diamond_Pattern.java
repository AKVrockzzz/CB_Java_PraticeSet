package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Hallor_Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1;
		int star = (num/2)+1;
		int space = -1;
		//Row Create
		while(row<=num) {
			//Star
			int i = 1;
			while(i<=star) {
				System.out.print("*\t");
				i++;
			}
			//Space
			int j = 1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			//Star
			int k = 1;
			if(row==1 || row==num) {
				k=2;
			}
			while(k<=star) {
				
				System.out.print("*\t");
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
