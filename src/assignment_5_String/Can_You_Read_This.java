package assignment_5_String;

import java.util.Scanner;

public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Print(s);
	}
	
	public static void Print(String str) {
		int start = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.println(str.substring(start,i));
				start = i;
			}
		}
		System.out.println(str.substring(start));
	}

}
