package assignment_5_String;
import java.util.*;
public class Strings_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Print(s);
	}
	
	public static void Print(String str) {
		int count = 1;
		String ans = "";
		char previousCh = str.charAt(0);
		ans += previousCh;
		
		for(int i=1; i<str.length(); i++) {
			char currCh = str.charAt(i);
			if( currCh == previousCh) count++;
			else {
				if(count > 1) {
					ans += count;
				}
				ans += currCh;
				count = 1;
			}
			previousCh = currCh;
		}
		
		if( count > 1 ) ans += count;
		
		System.out.println(ans);
	}

}
