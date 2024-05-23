package Assignment2_Using_Function;
import java.util.*;
public class Replace_Them_All {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long num = sc.nextLong();  // Changed to long to handle larger inputs
	        System.out.print(replaceZeroWithFive(num));
	    }
	    
	    public static long replaceZeroWithFive(long n) {
	        // Convert the number to a string
	        String numStr = String.valueOf(n);
	        // Replace all '0' characters with '5'
	        String modifiedStr = numStr.replace('0', '5');
	        // Convert the modified string back to a long integer
	        return Long.parseLong(modifiedStr);
	    }

}
