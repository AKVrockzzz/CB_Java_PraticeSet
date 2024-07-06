package RevisionSet1_Recursion;

public class Playing_Witg_A_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cbaeicde";
		System.out.println(Total_Continue_Vowels(str));
	}
	public static int Total_Continue_Vowels(String str) {
		int ans = 0;
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(IsVowel(ch) == true) count++;
			else {
				ans = Math.max(ans, count);
				count = 0;
			}
		}
		return ans;
	}
	public static boolean IsVowel(char ch) {
		// TODO Auto-generated method stub
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
		return false;
	}

}
