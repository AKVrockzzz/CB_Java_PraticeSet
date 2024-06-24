package RevisionSet1_String;

import java.util.Scanner;

public class Reverse_Words_In_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = " the sky    is blue";
		System.out.println(ReverseWords(s));
		
	}
	public static String ReverseWords(String s) {
		s = s.trim();
		String[] arr = s.split("\s+");
		String ans = "";
		for(int i=arr.length-1; i>=0; i--) {
			ans = ans + arr[i] + " ";
		}
		return ans.trim();
	}

}
