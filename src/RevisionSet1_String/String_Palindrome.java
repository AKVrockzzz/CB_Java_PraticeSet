package RevisionSet1_String;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "naan";
	}
	public static boolean IsPalindrome(String s) {
		int i=0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
