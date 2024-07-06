package RevisionSet1_Recursion;

public class Factorial_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(Fact(n));
	}
	public static int Fact(int n) {
		if(n == 0 || n == 1) return n;
		int fn = Fact(n-1);
		return fn * n;
	}

}
