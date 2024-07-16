package RevisionSet02_Recursion;

public class Fibonaaci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		int n = 7;
		Print(a,b,n-2);
	}
	public static void Print(int a, int b, int n) {
		if(n == 0) return;
		int c = a + b;
		System.out.println(c);
		Print(b,c,n-1);
	}

}
