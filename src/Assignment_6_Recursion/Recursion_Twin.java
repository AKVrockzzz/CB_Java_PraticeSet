package Assignment_6_Recursion;
import java.util.*;
public class Recursion_Twin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Twin_Count(str, 0));
	}

	public static int Twin_Count(String str, int i) {
		// TODO Auto-generated method stub
		 // Base case: if the remaining string is less than 3 characters, no twins can exist
		if( i >= str.length() - 2) return 0;
		// Check if the current character and the character two positions ahead form a twin
		int count = 0;
		if(str.charAt(i) == str.charAt(i+2)) count = 1;
		
		return count + Twin_Count(str, i+1);
		
	}

}
