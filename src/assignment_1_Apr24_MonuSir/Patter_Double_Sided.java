package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Patter_Double_Sided {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1;
		int star = 1;
		int space2 = -1;
		int space1 = num-1;
		int count = 1;
		//Row Create
		while(row<=num) {
			//Space
			int i = 1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			//Star
			int j = 1;
			while(j<=star) {
				System.out.print(count + " ");
				count--;
				j++;
			}
			//Space
			i = 1;
			while(i<=space2) {
				System.out.print("  ");
				i++;
			}
			//Star
			j = 1;
			if(row==1 || row==num) {
				j=2;
				count=1;
			}
			while(j<=star) {

				count++;
				System.out.print(count + " ");
				j++;
			}
			//Mirror
			if(row<=num/2) {
				star++;
				space1-=2;
				space2+=2;
				count++;
			}else {
				star--;
				space1+=2;
				space2-=2;
				count--;
			}
			//Row Update
			row++;
			
			System.out.println();
		}
	}

}
