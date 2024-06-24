package RevisionSet1_String;

public class SubString_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hellobye";
//		System.out.println(s.substring(0,5));
		PrintSubString(s);
	}
	public static void PrintSubString(String s) {
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}

}
