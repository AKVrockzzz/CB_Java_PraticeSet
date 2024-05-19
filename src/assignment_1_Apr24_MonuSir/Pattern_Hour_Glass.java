package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Pattern_Hour_Glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1;
		int star = 2*num+1;
		int space = 0;
		int count = num;
		//Row Create
		while(row<=2*num+1) {
			//Space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//Star
			int j = 1;
			while(j<=star) {
				System.out.print(count + " ");
				if(j<=star/2) {
					count--;
				}
				else {
					count++;
				}
				j++;
			}
			//Mirror
			if(row<=num) {
				star-=2;
				space++;
				count-=2;
			}
			else {
				star+=2;
				space--;
//				count++;
			}
			//Row Update
			row++;
//			star-=2;
//			space++;
//			count-=2;
			System.out.println();
		}
	}

}
