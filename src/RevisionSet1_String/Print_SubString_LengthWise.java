package RevisionSet1_String;

public class Print_SubString_LengthWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		Substring(str);
	}
	public static void Substring(String str) {
		for(int len = 1; len<=str.length(); len++) {
			for(int j=len; j<=str.length(); j++) {
				int i = j-len;
				System.out.println(str.substring(i,j));
			}
		}
	}

}
