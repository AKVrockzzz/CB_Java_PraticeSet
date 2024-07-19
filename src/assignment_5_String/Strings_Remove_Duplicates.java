package assignment_5_String;

import java.util.Scanner;

public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Remove_Dublicated(str);
	}

	public static void Remove_Dublicated(String str) {
		// TODO Auto-generated method stub
		String ans = str.substring(0,1);
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i+1) != str.charAt(i)) {
				ans += str.charAt(i+1);
			}
		}
		System.out.println(ans);
	}

}
