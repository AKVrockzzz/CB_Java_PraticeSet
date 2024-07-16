package RevisionSet02_Recursion;

public class Power_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 4;
		System.out.println(Pow(x,n));
	}
	public static int Pow(int x, int n) {
		if(n == 0) return 1;
		
		if(x == 0) return 0;
		
		int pownm1 = Pow(x , n-1);
		int powcal = x * pownm1;
		return powcal;
	}

}
