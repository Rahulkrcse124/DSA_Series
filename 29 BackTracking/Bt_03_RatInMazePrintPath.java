public class Bt_03_RatInMazePrintPath {

    public static void printPath(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
        }

        // go right
        printPath(sr, sc + 1, er, ec, s + "R");

        // go down
        printPath(sr + 1, sc, er, ec, s + "D");

    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        printPath(1, 1, row, col, "");

        /*
         * RRDD
         * RDRD
         * RDDR
         * DRRD
         * DRDR
         * DDRR
         */

    }

}
