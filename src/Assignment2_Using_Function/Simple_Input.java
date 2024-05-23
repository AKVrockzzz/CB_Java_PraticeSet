package Assignment2_Using_Function;

import java.util.Scanner;

public class Simple_Input {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int cumulativeSum = 0;
	        boolean continueProcessing = true;

	        while (continueProcessing) {
	            int number = sc.nextInt();
	            cumulativeSum += number;
	            if (cumulativeSum < 0) {
	                continueProcessing = false;
	            } else {
	                System.out.println(number);
	            }
	        }

	        sc.close();
	    }
}
