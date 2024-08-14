package Assignment_6_Recursion;

import java.util.Scanner;

public class Generate_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
		String str = sc.next();
		Generate(str,0,"");
		}
	}

	public static void Generate(String str, int idx, String ans) {
		// TODO Auto-generated method stub
		
		if(idx==str.length()) {
			System.out.print(ans + " ");
			return;
		}
		
		char ch = str.charAt(idx);
		if(ch == '?') {
			Generate(str, idx+1, ans+'0');
			Generate(str, idx+1, ans+'1');
		}
		else {
			Generate(str, idx+1, ans+ch);
		}
	}


}
