public class Bn_10_ProductOfAllNodes {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int product(Node root) {
        // base case
        if (root == null) {
            return 1;
        }

        // recursive work
        int rootValue = root.data;
        int leftValue = product(root.left);
        int rightValue = product(root.right);

        // self work
        int productValue = rootValue * leftValue * rightValue;

        return productValue;

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

        System.out.println(product(root));
    }
}
