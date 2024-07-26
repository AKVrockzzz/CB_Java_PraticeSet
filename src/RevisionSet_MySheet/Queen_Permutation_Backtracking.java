package RevisionSet_MySheet;

public class Queen_Permutation_Backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		Permutation(board, tq, 0, "");
	}

	public static void Permutation(boolean[] board, int tq, int qpsf, String ans) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<board.length; i++) {
			if(board[i] == false) {
				board[i] = true;
				Permutation(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
				board[i] = false;
			}
		}
	}

}
