package RevisionSet_MySheet;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1,3,2};
		int amount = 5;
		Permutation(coin, amount, "");
	}

	public static void Permutation(int[] coin, int amount, String ans) {
		// TODO Auto-generated method stub
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<coin.length; i++) {
			if(amount >= coin[i]) {
				Permutation(coin, amount - coin[i], ans + coin[i]);
			}
		}
	}

}
