package RevisionSet_MySheet;
import java.util.*;
public class Inverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] inv = Inverse(arr);
		for(int i=0; i<inv.length; i++) {
			System.out.print(inv[i] + " ");
		}
	}
	public static int[] Inverse(int[] arr) {
		int[] inv = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int v = arr[i];
			inv[v] = i;
			
		}
		return inv;
	}

}
