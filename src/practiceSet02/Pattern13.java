package practiceSet02;
import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of rows: ");
		int num = sc.nextInt();
		int row=1;
		int star=1;
		//Row Create
		while(row<=num) {
			//Star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//Row Update
			System.out.println();
			row++;
			star++;
		}
		//Reverse Pattern Loop
		while(row>=1) {
			//Star
			int j=1;
			while(j<=star-2) {
				System.out.print("* ");
				j++;
			}
			//Row Update
			System.out.println();
			row--;
			star--;
		}
	}

}
