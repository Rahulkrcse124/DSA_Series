public class Bn_01_InvertBt_LC226 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void beforeInvertedTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        beforeInvertedTree(root.left);
        beforeInvertedTree(root.right);
    }

    public static Node afterInvertedTree(Node root) {

        if (root == null) {
            return root;
        }
        if (root.left == null && root.right == null) {
            return root;
        }

        Node leftNode = root.left;
        Node rightNode = root.right;

        root.left = afterInvertedTree(rightNode);
        root.right = afterInvertedTree(leftNode);

        return root;
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
        b.right = e;

        System.out.println("before Tree");
        beforeInvertedTree(root);

        System.out.println();
        System.out.println();

        System.out.println("after Inverted Tree");
        Node ans = afterInvertedTree(root);
        beforeInvertedTree(ans);

    }
}