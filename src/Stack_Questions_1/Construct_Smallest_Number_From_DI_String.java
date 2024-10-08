package Stack_Questions_1;
import java.util.*;
public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(Construct_Smaller(s));
	}
	
	public static String Construct_Smaller(String s) {
		int n = s.length();
		int[] ans = new int[n+1];
		Stack<Integer> st = new Stack<>();
		int c = 1;
		for(int i=0; i<=n; i++) {
			if(i == n || s.charAt(i) == 'I') {
				ans[i] = c;
				c++;
				while(!st.isEmpty()) {
					ans[st.pop()] = c;
					c++;
				}
			}
			else {
				st.push(i);
			}
		}
		String str = "";
		for(int i=0; i<ans.length; i++) {
			str += ans[i];
		}
		return str;
	}

}
