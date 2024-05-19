package assignment_1_Apr24_MonuSir;

import java.util.Scanner;

public class Pascal_Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Row: ");
		int num = sc.nextInt();
		int row=0;
		int star=1;
		
		System.out.println();
		// Row number
		while (row<num) {
			// Star Print
			int i=0;
			int ncr=1;
			while (i<star) {
				System.out.print(ncr+" ");
				ncr= ((row-i)*ncr)/(i+1);
				i++; 
			}
			// Row update;
			System.out.println();
			row++;
			star++;
		}
	}

}
