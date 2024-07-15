package assignment_5_String;

public class Playing_With_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "cbaeicde";
		System.out.println(Total_Vowels(S));
	}

	public static int Total_Vowels(String s) {
		// TODO Auto-generated method stub
		int ans = 0;
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(IsVowel(ch) == true) {
				count++;
			}
			else {
				ans = Math.max(ans, count);
				count = 0;
			}
		}
		ans = Math.max(ans, count);
		return ans;
	}

	public static boolean IsVowel(char ch) {
		// TODO Auto-generated method stub
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
