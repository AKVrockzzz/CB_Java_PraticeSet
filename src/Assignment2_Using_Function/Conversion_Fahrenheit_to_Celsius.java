package Assignment2_Using_Function;
import java.util.*;
public class Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int minFahrenheit = sc.nextInt();
		int maxFahrenheit = sc.nextInt();
		int step = sc.nextInt();
		print_Fahrenheit_to_Celsius(minFahrenheit,maxFahrenheit,step);
	}
	
	public static void  print_Fahrenheit_to_Celsius(int minF, int maxF, int step) {
		for(int Fahrenheit = minF; Fahrenheit<=maxF; Fahrenheit+=step) {
			int celsuis = convertFahrenheit_ToCelsuid(Fahrenheit);
			System.out.println(Fahrenheit + " " + celsuis);
		}
	}
	
	public static int convertFahrenheit_ToCelsuid(int F) {
		return (int)((5.0/9)*(F-32));
	}

}
