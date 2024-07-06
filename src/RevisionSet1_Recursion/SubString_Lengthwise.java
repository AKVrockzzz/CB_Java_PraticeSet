package RevisionSet1_Recursion;

public class SubString_Lengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		Print(str);
	}
	public static void Print(String str) {
		for(int len=1; len<=str.length(); len++) {
			for(int j=len; j<=str.length(); j++) {
				int i= j-len;
				System.out.println(str.substring(i,j));
			}
		}
	}

}
