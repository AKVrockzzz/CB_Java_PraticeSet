package RevisionSet_MySheet;
import java.util.*;
public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2,3,5};
		int amount = 8;
		List<Integer> ll = new ArrayList<>();
		Combination(coin, amount, ll, 0);
	}

	public static void Combination(int[] coin, int amount, List<Integer> ll, int idx) {
		// TODO Auto-generated method stub
		if(amount == 0) {
			System.out.println(ll);
			
			return;
		}
		
		for(int i=idx; i<coin.length; i++) {
			if(amount >= coin[i]) {
				ll.add(coin[i]);;
				Combination(coin, amount - coin[i], ll, i);
				ll.remove(ll.size()-1);
			}
		}
	}

}
