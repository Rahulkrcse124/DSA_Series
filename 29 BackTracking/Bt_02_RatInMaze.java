public class Bt_02_RatInMaze {

    public static int totalWays(int sr, int sc, int er, int ec) {

        if (sr > er || sc > ec)
            return 0;
        if (sr == er && sc == ec)
            return 1;
        int rightWay = totalWays(sr, sc + 1, er, ec);
        int downWay = totalWays(sr + 1, sc, er, ec);
        int totalways = rightWay + downWay;

        return totalways;
    }

    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        System.out.println(totalWays(1, 1, row, col));

    }

}
