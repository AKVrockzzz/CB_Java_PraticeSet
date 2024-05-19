package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Number_Mountain_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2*num-3;
        
        // Row Create
        while (row <= num) {
            // Print first part of numbers (increasing)
            int i = 1;
            int count = 1;
            while (i <= star) {
                System.out.print(count + "\t");
                count++;
                i++;
            }
            
            // Print spaces
            int j = 1;
            while (j <= space) {
                System.out.print("\t");
                j++;
            }
            
            // Print second part of numbers (decreasing)
            int k = 1;
              // Adjust count before starting the decreasing part
            if(row==num) {
            	count--;
            	k=2;
            }
            while (k <= star) {
            	count--;
            	
                System.out.print(count + "\t");
                
                k++;
            }
            
            // Row Update
            row++;
            star++;
            space -= 2;
            System.out.println();
        }
	}

}
