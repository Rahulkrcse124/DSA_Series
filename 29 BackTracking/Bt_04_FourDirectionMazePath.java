public class Bt_04_FourDirectionMazePath {

    public static void printPath(int sr, int sc, int er, int ec, String s, boolean isVisited[][]) {

        if (sr < 0 || sc < 0) {
            return;
        }

        if (sr > er || sc > ec) {
            return;
        }

        if (isVisited[sr][sc] == true) {
            return;
        }

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        isVisited[sr][sc] = true;
        // go right
        printPath(sr, sc + 1, er, ec, s + "R", isVisited); // starting column increment

        // go down
        printPath(sr + 1, sc, er, ec, s + "D", isVisited); // starting row increment

        // go left
        printPath(sr, sc - 1, er, ec, s + "L", isVisited); // starting column decrement

        // go up
        printPath(sr - 1, sc, er, ec, s + "U", isVisited); // starting row decrement

        // after all calling
        isVisited[sr][sc] = false;

    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean isVisited[][] = new boolean[row][col];

        printPath(0, 0, row - 1, col - 1, "", isVisited);

    }

}