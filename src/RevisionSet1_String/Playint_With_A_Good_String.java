package RevisionSet1_String;

import java.util.Scanner;

public class Playint_With_A_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Longest_Good_String(s));
	}
	public static int Longest_Good_String(String s) {
		int ans = 0, count = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(IsVowel(ch) == true) count++;
			else {
				ans = Math.max(ans, count);
				count = 0;
			}
		}
		return ans;
	}
	public static boolean IsVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
		return false;
	}

}
