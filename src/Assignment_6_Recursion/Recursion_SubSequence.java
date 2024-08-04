package Assignment_6_Recursion;

import java.util.Scanner;

public class Recursion_SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		System.out.println("\n" + Print(ques, ""));
	}

	public static int Print(String ques, String ans) {
		// TODO Auto-generated method stub
		
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		int count = 0;
		char ch = ques.charAt(0);
		count += Print(ques.substring(1), ans);
		count += Print(ques.substring(1), ans + ch);
		return count;
	}

}
