public class Bt_05_RatInDeadMazeRightDown {

    public static void pathOfDeadMaze(int sr, int sc, int er, int ec, int maze[][], String s) {
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

        // go right
        pathOfDeadMaze(sr, sc + 1, er, ec, maze, s + "R"); // increment column

        // go Down
        pathOfDeadMaze(sr + 1, sc, er, ec, maze, s + "D"); // increment row

    }

    public static void main(String[] args) {
        int row = 4;
        int column = 6;
        int maze[][] = {
                { 1, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 1 },
                { 0, 1, 1, 1, 1, 1 },
                { 0, 0, 1, 0, 1, 1 },
        };

        pathOfDeadMaze(0, 0, row - 1, column - 1, maze, "");
    }
}