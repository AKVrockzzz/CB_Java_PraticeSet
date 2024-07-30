package Assignment_6_Recursion;

import java.util.Scanner;

public class Replace_All_0s_With_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = Replace(num);
		System.out.println(result);
	}

	public static int Replace(int num) {
		// TODO Auto-generated method stub
		if( num == 0) return 0;
		
		int lastDigit = num % 10;
		
		if(lastDigit == 0) lastDigit = 5;
		int smallerNum = Replace(num / 10);
		
		return smallerNum * 10 + lastDigit;
	}

}
