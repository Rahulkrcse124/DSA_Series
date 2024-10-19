public class Bn_13_PostOrder {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void postOrder(Node root) {
        // base case
        if (root == null) {
            return;
        }

        // recursive work
        postOrder(root.left);
        postOrder(root.right);

        // self work
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(4);
        Node b = new Node(7);
        root.left = a;
        root.right = b;

        Node c = new Node(2);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(8);
        b.right = e;

        Node f = new Node(9);
        e.left = f;

        postOrder(root);

    }

}
