package LeetCode;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define the board and the word to search for
        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}}; 
        String word = "ABCCED";
        
        // Iterate over the board to find the starting point of the word
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) { // Corrected loop condition
                if (board[i][j] == word.charAt(0)) {
                    // Call the search function from the starting point
                    boolean ans = Search(board, i, j, word, 0);
                    if (ans) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        // If no valid path is found, print false
        System.out.println(false);
    }
    
    public static boolean Search(char[][] board, int cr, int cc, String word, int idx) {
        // Base case: if all characters are matched
        if (idx == word.length()) {
            return true;
        }
        
        // Boundary checks and character match
        if (cr < 0 || cr >= board.length || cc < 0 || cc >= board[0].length || board[cr][cc] != word.charAt(idx)) {
            return false;
        }
        
        // Mark the cell as visited
        char temp = board[cr][cc];
        board[cr][cc] = '*';
        
        // Define movements: up, left, down, right
        int[] r = {-1, 0, 1, 0};
        int[] c = {0, -1, 0, 1};
        
        // Explore all directions
        for (int k = 0; k < r.length; k++) {
            if (Search(board, cr + r[k], cc + c[k], word, idx + 1)) {
                return true;
            }
        }
        
        // Backtrack: unmark the cell
        board[cr][cc] = temp;
        
        return false;
    }

}
