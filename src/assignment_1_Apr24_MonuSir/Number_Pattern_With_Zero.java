package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Number_Pattern_With_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1;
		int star = 1;
		int count = 1;
		//Row Update
		while(row<=num) {
			//Star
			int i = 1;
			while(i<=star) {
				
				if(i==1 || i==star) {
					System.out.print(count + "\t");
				}else {
					System.out.print("0\t");
				}
				i++;
			}
			//Row Update
			row++;
			star++;
			count++;
			System.out.println();
		}
	}

}
