package Assignment_6_Recursion;
import java.util.*;
public class Recursion_Convert_String_To_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Convert(str, 0, 0));
	}

	public static int Convert(String str, int idx, int ans) {
		// TODO Auto-generated method stub
		if(idx == str.length()) return ans;
		char ch = str.charAt(idx);
		int num = ch - 48;
		ans = ans * 10 + num;
		
		return Convert(str, idx + 1, ans);
	}

}
