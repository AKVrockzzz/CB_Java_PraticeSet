package RevisionSet02_Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Fact(n));
	}
	public static int Fact(int n) {
		if( n == 0) return 1;
		int fa = Fact(n-1);
		return n * fa;
	}

}
