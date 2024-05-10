package practiceSet02;
import java.util.*;
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=1;
		int space=num-1;
		//Row create
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
				if(j%2==0) {
					System.out.print("! ");
				}
				else {
					System.out.print("* ");
				}
				j++;
			}
			//Row Update
			System.out.println();
			row++;
			space--;
			star+=2;
		}
	}

}
