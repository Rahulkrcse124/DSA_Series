public class Bn_09_MinValue {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int minValue(Node root) {
        int min = Integer.MAX_VALUE;
        // base case
        if (root == null) {
            return min;
        }

        // recursive work
        int rootValue = root.data;
        int minLeftValue = minValue(root.left);
        int minRightValue = minValue(root.right);

        // self work
        if (rootValue < min) {
            min = rootValue;
        }
        if (minLeftValue < min) {
            min = minLeftValue;
        }
        if (minRightValue < min) {
            min = minRightValue;
        }

        return min;
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

        System.out.println(minValue(root));

    }

}
