package LeetCode_Array;
import java.util.*;
public class Valid_Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Square(N));
	}
	public static boolean Square(int num) {
		int lo = 0;
		int hi = num;
		while(lo<=hi) {
			int mid = lo + ((hi-lo)/2);
			long sq =(long) mid*mid;
			if(sq > num) {
				hi=mid-1;
			}
			else if(sq < num) {
				lo=mid+1;
			}
			else {
				return true;
			}
		}
		return false;
	}

}
