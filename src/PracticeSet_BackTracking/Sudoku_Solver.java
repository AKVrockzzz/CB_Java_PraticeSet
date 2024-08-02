package PracticeSet_BackTracking;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
		         		 { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
		         		 { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
		         		 { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
		         		 { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
		         		 { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
		         		 { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
		         		 { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
		         		 { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Print(grid, 0, 0);
	}

	public static void Print(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		if(col == 9) {
			col = 0;
			row++;
		}
		if(row==9) {
			Display(grid);
			return;
		}
		if(grid[row][col] != 0) {
			Print(grid, row, col+1);
		}
		else {
			for(int val=1; val<=9; val++) {
				if(IsSafe(grid, row, col, val) == true) {
					grid[row][col] = val;
					Print(grid, row, col+1);
					grid[row][col] = 0;
				}
			}
		}
	}

	public static boolean IsSafe(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		
		//col
		for(int i=0; i<9; i++) {
			if(grid[i][col] == val) {
				return false;
			}
		}
		
		//col
		
		for(int i=0; i<9; i++) {
			if(grid[row][i] == val) return false;
		}
		
		// 3x 3 matrix
		
		row = row - row % 3;
		col = col - col % 3;
		for(int i=row; i< row+3; i++) {
			for(int j=col; j<col+3; j++) {
				if(grid[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}

	public static void Display(int[][] grid) {
		// TODO Auto-generated method stub
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

}
