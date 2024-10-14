public class Bt_01_RatInMaze {

    public static int ratInMazeWays(int sr, int sc, int er, int ec) {
        // sr: starting roe
        // sc: starting column
        // er: ending row
        // ec: ending column

        if (sr > er || sc > ec)
            return 0;

        if (sr == er && sc == ec)
            return 1;

        int rightWay = ratInMazeWays(sr, sc + 1, er, ec);
        int downWay = ratInMazeWays(sr + 1, sc, er, ec);
        int totalways = rightWay + downWay;

        return totalways;
    }

    public static void main(String[] args) {
        int row = 2;
        int col = 2;

        int tWays = ratInMazeWays(1, 1, row, col);
        System.out.print("Total ways is = " + tWays);

    }
}