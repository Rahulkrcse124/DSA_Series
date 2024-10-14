public class Bt_06_RatInMazeFourDirection {

    public static void ratPath(int sr, int sc, int er, int ec, int maze[][], String s, boolean isVisited[][]) {

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

        if (isVisited[sr][sc] == true) {
            return;
        }

        isVisited[sr][sc] = true;
        // go right
        ratPath(sr, sc + 1, er, ec, maze, s + "R", isVisited); // increment Column

        // go Down
        ratPath(sr + 1, sc, er, ec, maze, s + "D", isVisited); // increment row

        // go left
        ratPath(sr, sc - 1, er, ec, maze, s + "L", isVisited);// decrement column

        // go UP
        ratPath(sr - 1, sc, er, ec, maze, s + "U", isVisited);// decrement row

        isVisited[sr][sc] = false;

    }

    public static void main(String[] args) {
        int row = 3;
        int column = 4;
        int maze[][] = {
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 }
        };

        boolean isVisited[][] = new boolean[row][column]; // space complexity: O(n*m)

        ratPath(0, 0, row - 1, column - 1, maze, "", isVisited);

        /*
         * DRRRD
         * DRRURDD
         * DDRURRD
         * DDRURURDD
         */
    }

}
