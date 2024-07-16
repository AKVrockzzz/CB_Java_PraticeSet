package RevisionSet02_Recursion;

public class Print_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		Print(n);
	}
	public static void Print(int n) {
		if(n == 6) return;
		System.out.println(n);
		Print(n+1);
	}

}
