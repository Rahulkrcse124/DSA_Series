public class Bt_09_nQueens {
    final int N = 4;

    /* A utility function to print solution */
    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1)
                    System.out.print(" Q ");
                else
                    System.out.print(" . ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /* Function to check if a queen can be placed on board[row][col] */
    boolean isSafe(int board[][], int row, int col) {
        // Check the same row on the left side
        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check the upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check the lower diagonal on the left side
        for (int i = row, j = col; i < N && j >= 0; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    /* Recursive function to solve N-Queen problem */
    boolean solveNQUtil(int board[][], int col) {
        // Base case: If all queens are placed
        if (col >= N)
            return true;

        // Try placing the queen in each row one by one in the current column
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                // Place the queen at board[i][col]
                board[i][col] = 1;

                // Recur to place queens in the next column
                if (solveNQUtil(board, col + 1))
                    return true;

                // Backtrack: Remove the queen if placing it doesn't lead to a solution
                board[i][col] = 0;
            }
        }

        // If the queen cannot be placed in any row in this column, return false
        return false;
    }

    /* Function to solve the N-Queen problem */
    boolean solveNQ() {
        int board[][] = new int[N][N];

        if (!solveNQUtil(board, 0)) {
            System.out.println("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String[] args) {
        Bt_09_nQueens Queen = new Bt_09_nQueens();
        Queen.solveNQ();
    }
}
