package Assignment2_Using_Function;
import java.util.*;
public class Conversion_Any_To_Any {

	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int sb = sc.nextInt();
			int db = sc.nextInt();
			int sn = sc.nextInt();
	        if(sb<=10 && db<=10){
			System.out.println(convertBase(sb,db,sn));
	        }
		}
		
		public static int convertBase(int sb, int db, int sn) {
			int decimalNumber = toDecimal(sb,sn);
			return fromDecimal_ToBase(db,decimalNumber);
		}
		
		public static int toDecimal(int sb, int sn) {
			int decimalNumber = 0;
			int pow=0;
			while(sn>0) {
				int digit = sn%10;
				decimalNumber += digit * Math.pow(sb, pow);
				pow++;
				sn/=10;
			}
			
			return decimalNumber;
		}
		
		public static int fromDecimal_ToBase(int db, int decimalNumber) {
			int result = 0;
			int placeValue = 1;
			while(decimalNumber>0) {
				int rem = decimalNumber%db;
				result += rem * placeValue;
				placeValue *= 10;
				decimalNumber /= db;
			}
			return result;
		}

}
