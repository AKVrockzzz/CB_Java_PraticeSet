package RevisionSet2_String;

public class PrintSubString_Lengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		Print(str);
	}
	public static void Print(String str) {
		for(int len = 1; len<=str.length(); len++) {
			for(int j=len; j<=str.length(); j++) {
				int i = j-len;
				System.out.print(str.substring(i,j) + ", ");
			}
			System.out.println();
		}
	}

}
