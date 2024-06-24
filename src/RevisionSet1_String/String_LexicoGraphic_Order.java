package RevisionSet1_String;

public class String_LexicoGraphic_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "komarl";
		String s2 = "kunal";
		// return +ve if s1>s2
		// return -ve if s1<s2
		// return 0 if s1 == s2
		System.out.println(compareTo(s1,s2));
	}
	public static int compareTo(String s1, String s2) {
		//check char by char
		for(int i=0; i<s1.length() && i<s2.length(); i++) {
			if((int) s1.charAt(i) == (int) s2.charAt(i)) continue;
			else return (int)s1.charAt(i) - (int) s2.charAt(i);
		}
		
		//check String length
		
		if(s1.length() < s2.length()) return (s1.length()-s2.length());
		else if (s1.length() > s2.length()) return ((s1.length() + s2.length()));
		else return 0;
	}

}
