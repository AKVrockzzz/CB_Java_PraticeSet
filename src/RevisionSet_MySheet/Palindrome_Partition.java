package RevisionSet_MySheet;

import java.util.*;

public class Palindrome_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partition(ques, ll, ans);
		System.out.println(ans);
	}
	public static void Partition(String ques, List<String> ll, List<List<String>> ans){
		
		if( ques.length() == 0) {
//			System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=1; i<=ques.length(); i++) {
			String s = ques.substring(0,i);
			if(IsPalindrome(s)) {
			ll.add(s);
			Partition(ques.substring(i),ll, ans);
			}
		}
	}
	public static boolean IsPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length()-1;
		while (i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
