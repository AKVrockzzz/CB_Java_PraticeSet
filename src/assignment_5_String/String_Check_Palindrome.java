package assignment_5_String;

import java.util.Scanner;

public class String_Check_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(IsPalindrome(str));
	}

	public static boolean IsPalindrome(String str) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = str.length()-1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
