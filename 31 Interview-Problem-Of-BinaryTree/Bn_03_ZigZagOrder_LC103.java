public class Bn_03_ZigZagOrder_LC103 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void nthLevelLeftToRight(Node root, int n) {
        if (root == null) {
            return;
        }

        if (n == 1) {
            System.out.print(root.data + " ");
            return;
        }
        nthLevelLeftToRight(root.left, n - 1);
        nthLevelLeftToRight(root.right, n - 1);
    }

    public static void nthLevelRightToLeft(Node root, int n) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            System.out.print(root.data + " ");
            return;
        }

        nthLevelLeftToRight(root.right, n - 1);
        nthLevelLeftToRight(root.left, n - 1);

    }

    public static int levelOrder(Node root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = levelOrder(root.left);
        int rightHeiht = levelOrder(root.right);

        int level = 0;
        if (leftHeight > level) {
            level = leftHeight;
        }
        if (rightHeiht > level) {
            level = rightHeiht;
        }

        return 1 + level;
    }

    public static void zigZag(Node root) {
        int level = levelOrder(root);
        for (int i = 1; i <= level; i++) {
            if (i % 2 != 0) {
                nthLevelLeftToRight(root, i);
            } else {
                nthLevelRightToLeft(root, i);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        // Node g = new Node(8);
        // c.right = g;

        // Node h = new Node(9);
        // e.left = h;

        // Node i = new Node(10);
        // f.left = i;

        // nthLevelLeftToRight(root, 4);

        System.out.println();
        System.out.println();
        // nthLevelRightToLeft(root, 4);

        System.out.println();
        System.out.println();
        zigZag(root);
    }

}
