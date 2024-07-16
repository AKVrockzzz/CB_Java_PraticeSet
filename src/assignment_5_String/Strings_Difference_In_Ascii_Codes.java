package assignment_5_String;

import java.util.Scanner;

public class Strings_Difference_In_Ascii_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Ascii_Difference(str);
	}

	public static void Ascii_Difference(String str) {
		// TODO Auto-generated method stub
		String ans = "";
		char previous = str.charAt(0);
		
		
		for(int i = 1; i<str.length(); i++) {
			ans += previous;
			char curr = str.charAt(i);
			int ascii = curr - previous;
			ans += ascii;
			previous = curr;
		}
		System.out.println(ans + previous);
	}

}
