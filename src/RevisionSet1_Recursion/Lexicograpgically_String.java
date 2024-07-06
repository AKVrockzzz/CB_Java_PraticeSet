package RevisionSet1_Recursion;

public class Lexicograpgically_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "komal";
		String s2 = "kunal";
		System.out.println(Compare_String(s1,s2)) ;
	}

	public static int Compare_String(String s1, String s2) {
		// TODO Auto-generated method stub
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(i)) continue;
			else return s1.charAt(i) - s2.charAt(i);
		}
		if(s1.length() > s2.length()) return s1.length() + s2.length();
		else if (s1.length() < s2.length()) return s1.length() - s2.length();
		else return 0;
	}

}
