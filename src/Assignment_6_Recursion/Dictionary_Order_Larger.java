package Assignment_6_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_Order_Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		String org = ques;
		String sortStr = Sort(ques);
		Permutation(sortStr,"", org);
	}
	
	public static String Sort(String s) {
		char[] tempStr = s.toCharArray();
		Arrays.sort(tempStr);
		
		return new String(tempStr);
	}

	public static void Permutation(String ques, String ans, String org) {
		// TODO Auto-generated method stub
		
		if(ques.length() == 0) {
			if(ans.compareTo(org) > 0) {

				System.out.println(ans);
			}
			return;
		}
		
		for(int i=0; i<ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean val = true;
			
			for(int j=i+1; j<ques.length(); j++) {
				if(ques.charAt(j) == ch) {
					val = false;
					break;
				}
			}
			
			if(val) {
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			Permutation(s1+s2, ans+ch, org);
			}
		}
	}

}
