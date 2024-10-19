public class Bn_15_PrintNthLevel {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void levelOrderPrint(Node root, int n) {
        // base case
        if (root == null)
            return;
        if (n == 0)
            return;

        // self work
        if (n == 1) {
            System.out.print(root.data + " ");
        }

        // recursive work
        levelOrderPrint(root.left, n - 1);
        levelOrderPrint(root.right, n - 1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(7);
        Node b = new Node(9);
        root.left = a;
        root.right = b;

        Node c = new Node(2);
        Node d = new Node(6);
        a.left = c;
        a.right = d;

        Node e = new Node(9);
        b.right = e;

        Node f = new Node(5);
        Node g = new Node(11);
        d.left = f;
        d.right = g;

        Node h = new Node(5);
        e.right = h;

        levelOrderPrint(root, 3);

    }
}