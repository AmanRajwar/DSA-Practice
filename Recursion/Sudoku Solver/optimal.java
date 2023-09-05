/*
    Time Complexity: O( N ^ ( N * N ) )
    Space Complexity: O( N*N )
    Where 'N' is the size of the sudoku board.
*/

public class optimal {

    public static boolean sudokuSolver(int board[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        if (check(board, i, j, k)) {
                            board[i][j] = k;
                            if (sudokuSolver(board)) {
                                return true;
                            } else {
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }

    private static boolean check(int[][] board, int row, int col, int k) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == k)
                return false;
            if (board[i][col] == k)
                return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == k)
                return false;
        }
        return true;
    }
}
