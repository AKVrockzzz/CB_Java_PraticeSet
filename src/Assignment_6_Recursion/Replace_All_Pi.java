package Assignment_6_Recursion;

import java.util.Scanner;

public class Replace_All_Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // Input number of string line
		sc.nextLine();
		ProcessLines(N, sc);
	}

	public static void ProcessLines(int n, Scanner sc) {
		// TODO Auto-generated method stub
		if (n <= 0) return; // Base care if no. of line is 0 then return
		
		String line = sc.nextLine(); // Input String
		
		String result = replacePi(line); // if String include pi then replace with 3.14
		
		System.out.println(result); // Print String after replace
		
		ProcessLines(n-1, sc); // Recursion call
	}

	public static String replacePi(String line) {
		// TODO Auto-generated method stub
		
		if(!line.contains("pi")) return line; // if string does not contain "pi" then return
		
		int index = line.indexOf("pi"); // take index where first occurance pi is available
		
		String before = line.substring(0,index); // String before index of pi
		String after = line.substring(index+2); // String after first occourance of pi
		
		return before + "3.14" + replacePi(after); // return string after replace pi with 3.14
	}

}
