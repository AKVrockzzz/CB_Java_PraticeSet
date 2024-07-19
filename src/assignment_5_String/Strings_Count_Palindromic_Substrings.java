package assignment_5_String;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Count_SubString(str));
	}

	public static int Count_SubString(String str) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length(); j++) {
				String ss = str.substring(i,j);
				if(IsPalindrome(ss) == true) {
					count++;
				}
			}
		}
		return count;
	}

	public static boolean IsPalindrome(String ss) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = ss.length()-1;
		while(i < j) {
			if(ss.charAt(i) != ss.charAt(j)) return false;
			else {
				i++;
				j--;
			}
		}
		return true;
	}
	
	

}
