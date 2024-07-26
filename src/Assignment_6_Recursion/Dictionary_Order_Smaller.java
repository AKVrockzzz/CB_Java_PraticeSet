package Assignment_6_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_Order_Smaller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		String sort = sortString(ques);
		Print(sort, "");
	}

	public static String sortString(String ques) {
		// TODO Auto-generated method stub
		
		char[] arr = ques.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	public static void Print(String ques, String ans) {
		// TODO Auto-generated method stub
		if( ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean val = true;
			
			for(int j=i+1; j<ques.length(); j++) {
				if(ques.charAt(j) == ch) {
					val = false;
					break;
				}
			}
			if(val == true) {
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			Print(s1 + s2, ans + ch);
			}
		}
	}

}
