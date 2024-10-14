public class Bt_07_RatInMazeFourDirectionOptimized {
    public static void ratPath(int sr, int sc, int er, int ec, int maze[][], String s) {

        if (sr < 0 || sc < 0) {
            return;
        }

        if (sr > er || sc > ec) {
            return;
        }

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        if (maze[sr][sc] == 0) {
            return;
        }

        if (maze[sr][sc] == -1) {
            return;
        }

        maze[sr][sc] = -1;

        // go right
        ratPath(sr, sc + 1, er, ec, maze, s + "R"); // increment Column

        // go Down
        ratPath(sr + 1, sc, er, ec, maze, s + "D"); // increment row

        // go left
        ratPath(sr, sc - 1, er, ec, maze, s + "L");// decrement column

        // go UP
        ratPath(sr - 1, sc, er, ec, maze, s + "U");// decrement row

        maze[sr][sc] = 1;

    }

    public static void main(String[] args) {
        int row = 3;
        int column = 4;
        int maze[][] = {
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 }
        };

        ratPath(0, 0, row - 1, column - 1, maze, "");

        /*
         * DRRRD
         * DRRURDD
         * DDRURRD
         * DDRURURDD
         */
    }
}
