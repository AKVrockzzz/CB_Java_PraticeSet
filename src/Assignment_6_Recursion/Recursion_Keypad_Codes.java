package Assignment_6_Recursion;

import java.util.Scanner;

public class Recursion_Keypad_Codes {
	static String[] map = {"", "abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		System.out.println("\n" + Combination(ques, ""));
	}
	public static int Combination(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		
		char ch = ques.charAt(0);
		int num = ch - '0';
		String press = map[num];
		int count = 0;
		for(int i=0; i<press.length(); i++) {
			count += Combination(ques.substring(1), ans + press.charAt(i));
		}
		return count;
	}

}
