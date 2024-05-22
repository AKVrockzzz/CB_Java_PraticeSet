package Assignment2_Using_Function;
import java.util.*;
public class SumOf_OddPlaced_EvenPlaced_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		OddEvenPlacedDigit(num);
	}
	
	public static void OddEvenPlacedDigit(int num) {
		int pos = 1;
		int oddPos = 0;
		int evenPos = 0;
		while(num>0) {
			int rem = num%10;
			if(pos%2==0) {
				evenPos+=rem;
			}
			else {
				oddPos+=rem;
			}
			num/=10;
			pos++;
		}
		System.out.println(oddPos);
		System.out.println(evenPos);
	}

}
