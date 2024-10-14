public class Bt_10_SudukooSolver {

    public static boolean sudukoSolver(int suduku[][], int row, int col) {

        // base case
        if (row == 9) {
            return true; // If we reach the end of the grid, the Sudoku is solved
        }

        // move to the next row if column reaches 9
        int nextRow = row;
        int nextCol = col + 1;

        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // if the cell already contains a number, skip it
        if (suduku[row][col] != 0) {
            return sudukoSolver(suduku, nextRow, nextCol);
        }

        // try placing digits 1 to 9 in the empty cell
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(suduku, row, col, digit)) {
                suduku[row][col] = digit;

                if (sudukoSolver(suduku, nextRow, nextCol)) {
                    return true; // if the board is solved, return true
                }

                suduku[row][col] = 0; // backtrack and reset the cell
            }
        }

        return false; // if no valid digit works, return false
    }

    // Helper function to check if it's safe to place a digit in the cell
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Check if the digit is already in the row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        // Check if the digit is already in the column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check if the digit is already in the 3x3 subgrid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true; // if all checks pass, it's safe to place the digit
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        if (sudukoSolver(sudoku, 0, 0)) {
            System.out.println("Solved Sudoku:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
