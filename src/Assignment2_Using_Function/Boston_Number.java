package Assignment2_Using_Function;
import java.util.*;
public class Boston_Number {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (isBostonNumber(n)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        sc.close();
    }

    // Function to check if a number is a Boston number
    public static boolean isBostonNumber(int n) {
        int sumOfDigits = sumDigits(n);
        int sumOfPrimeFactorsDigits = sumPrimeFactorsDigits(n);
        
        return sumOfDigits == sumOfPrimeFactorsDigits;
    }

    // Function to calculate the sum of digits of a number
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Function to calculate the sum of the digits of the prime factors of a number
    public static int sumPrimeFactorsDigits(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sum += sumDigits(i);
                n /= i;
            }
        }
        return sum;
    }

}
