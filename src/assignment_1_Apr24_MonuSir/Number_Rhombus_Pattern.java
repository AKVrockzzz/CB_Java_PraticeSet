package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Number_Rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int row = 1;
	        int star = 1;
	        int space = num - 1;

	        // Ensure num is within the specified range
	        if (num <= 0 || num >= 10) {
	            System.out.println("Invalid input. N must be between 0 and 10.");
	            return;
	        }

	        // Row create
	        while (row <= (num * 2) - 1) {
	            // Reset the count variable for each row
	            int count = num - space;

	            // Print spaces
	            int i = 1;
	            while (i <= space) {
	                System.out.print("\t");
	                i++;
	            }

	            // Print numbers with tabs in between
	            int j = 1;
	            while (j <= star) {
	                System.out.print(count);
	                if (j < star) { // Don't print a tab after the last number
	                    System.out.print("\t");
	                }
	                if (j <= star / 2) {
	                    count++;
	                } else {
	                    count--;
	                }
	                j++;
	            }

	            // Mirror the pattern
	            if (row < num) {
	                star += 2;
	                space--;
	            } else {
	                star -= 2;
	                space++;
	            }

	            // Row Update
	            row++;
	            System.out.println();
	        }

	        sc.close();
	    

	}

}
