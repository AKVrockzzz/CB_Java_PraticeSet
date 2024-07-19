package assignment_5_String;

import java.util.Scanner;

public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Max_Frequence_Character(str));
	}

	public static char Max_Frequence_Character(String str) {
		// TODO Auto-generated method stub
		int[] frequency = new int[256];
		for(int i=0; i<str.length(); i++) {
			frequency[str.charAt(i)]++;
		}
		
		int maxCount = 0;
		char maxFrequencyChar = str.charAt(0);
		for(int i=0; i<str.length(); i++) {
			if(frequency[str.charAt(i)] > maxCount) {
				maxCount = frequency[str.charAt(i)];
				maxFrequencyChar = str.charAt(i);
			}
		}
		return maxFrequencyChar;
	}

}
