package Stacks_Queue_Implementation;
import java.util.*;
import java.util.Stack;
public class Contruct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Smallest_Number(str));
		
	}

	private static String Smallest_Number(String pattern) {
		// TODO Auto-generated method stub
		int[] ans = new int[pattern.length() + 1];
		int count = 1;
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<=pattern.length(); i++) {
			
			if(i == pattern.length() || pattern.charAt(i) == 'I'){
				ans[i] = count;
				count++;
				while(!st.isEmpty()) {
					ans[st.pop()] = count;
					count++;
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
