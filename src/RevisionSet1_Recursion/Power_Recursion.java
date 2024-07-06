package RevisionSet1_Recursion;

public class Power_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int pow = 5;
		System.out.println(Pow(n,pow));
	}
	public static int Pow(int n, int pow) {
		if(pow == 0) return 1;
		int ans = Pow(n , pow-1);
		return ans * n;
	}

}
