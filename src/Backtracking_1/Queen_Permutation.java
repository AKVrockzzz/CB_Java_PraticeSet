package Backtracking_1;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		int qpsf = 0;
		Permutation(board, tq, "", qpsf);
	}

	public static void Permutation(boolean[] board, int tq, String ans, int qpsf) {
		// TODO Auto-generated method stub
		
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<board.length; i++) {
			if(board[i] == false) {
				board[i] = true;
				Permutation(board, tq, ans + "b" + i + "q" + qpsf,qpsf + 1);
				board[i] = false;
			}
		}
	}

}
