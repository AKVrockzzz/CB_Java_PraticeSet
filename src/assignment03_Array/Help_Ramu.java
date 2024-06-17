package assignment03_Array;
import java.util.*;
public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// c1  = 1;
		// c2 = 3
//		c3 = 7
//				c4 = 19   nr = 2, mc = 3/ rr = 2,5, rc = 4,4,4
		
		// Riks  = 1 (min)(2*1,3) = 2 // Riks 2 = 5 (min)(5*1,3) = 3   Total ride = 5   c3 =   min(5,7) = 5
		// Cab 1 = min(4 *1, 3) = 3 // Cab 2 = 4(min) (4) total ride = 9  c3 = 7
		// Combine rikhsaw || cab  5+7 = 12 min (12,19) = 12
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] rik = new int[N];
			for(int j=0; j<rik.length; j++) {
				rik[j] = sc.nextInt();
			}
			int[] cab = new int[M];
			for(int k=0 ; k<M; k++) {
				cab[k] = sc.nextInt();
			}
			System.out.println(MinCost(c1,c2,c3,c4,rik,cab));
		}
		
	}
	public static int MinCost(int c1, int c2, int c3, int c4, int[] rik, int[] cab) {
		int rikC = 0;
		int cabC = 0;
		int totalC = 0;
		for(int i=0; i<rik.length; i++) {
			rikC += Math.min(rik[i] * c1, c2);
		}
		rikC = Math.min(rikC, c3);
		
		for(int i=0; i<cab.length; i++) {
			cabC += Math.min(cab[i] * c1, c2);
		}
		cabC = Math.min(cabC, c3);
		totalC = Math.min(rikC + cabC, c4);
		return totalC;
		
	}

}
