package Assignment2_Using_Function;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
        // Creating a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Reading two integers from the input
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        
        // Printing the GCD of the two numbers
        System.out.println(GCD(N1, N2));
        
        // Closing the Scanner object
        sc.close();
    }
    
    // Function to compute the GCD of two numbers using the Euclidean algorithm
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
