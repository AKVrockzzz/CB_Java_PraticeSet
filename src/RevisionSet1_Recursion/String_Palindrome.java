package RevisionSet1_Recursion;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		System.out.println(Compare(str));
	}
	public static boolean Compare(String str) {
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
