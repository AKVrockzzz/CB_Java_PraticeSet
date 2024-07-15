package assignment_5_String;

import java.util.Scanner;

public class Strings_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Print(s);
	}
	public static void Print(String str) {
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				ans += Character.toLowerCase(ch);
			}
			else {
				ans += Character.toUpperCase(ch);
			}
		}
		System.out.println(ans);
	}

}
