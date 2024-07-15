package assignment_5_String;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Print(s);
	}
	
	public static void Print(String str) {
		int count = 1;
		String ans = str.substring(0,1);
		for(int i=0; i<str.length()-1; i++) {
			char ch = str.charAt(i+1);
			if(ch == str.charAt(i)) {
				count++;
			}
			else if(ch != str.charAt(i)) {
				ans = ans + count + str.charAt(i+1);
				count = 1;
			}
		}
		System.out.print(ans + count);
	}

}
