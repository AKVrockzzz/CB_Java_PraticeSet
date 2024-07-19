package assignment_5_String;

import java.util.Scanner;

public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		Print_Odd_Even_Character(str);
	}

	public static void Print_Odd_Even_Character(String str) {
		// TODO Auto-generated method stub
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(i % 2 == 0) {
				int ascii = ch + 1;
				char c = (char)ascii;
				ans += c;
			}
			else {
				int ascii = ch - 1;
				char c = (char)ascii;
				ans += c;
			}
		}
		System.out.println(ans);
	}

}
