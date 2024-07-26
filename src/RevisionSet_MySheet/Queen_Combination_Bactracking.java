package RevisionSet_MySheet;

public class Queen_Combination_Bactracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		Permutation(board, tq, 0, "",0);
	}

	public static void Permutation(boolean[] board, int tq, int qpsf, String ans, int idx) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		for(int i=idx; i<board.length; i++) {
			if(board[i] == false) {
				board[i] = true;
				Permutation(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf, i+1);
				board[i] = false;
			}
		}
	}

}
