package RevisionSet02_Recursion;

public class Fibonaaci_Series_Method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println(Fibo(n));
	}
	public static int Fibo(int n) {
		if( n == 0 || n == 1) return n;
		
		int fn = Fibo(n-1) + Fibo(n-2);
		return fn;
	}

}
