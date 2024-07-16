package RevisionSet02_Recursion;

public class Sum_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum(1,5,0);
	}
	public static void Sum(int i, int n, int sum) {
		if(i == n) {
			sum += i;
			System.out.println(sum);
			return;
		}
		
		sum += i;
		Sum(i+1, n, sum);
	}

}
