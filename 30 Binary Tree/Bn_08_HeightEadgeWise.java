public class Bn_08_HeightEadgeWise {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root) {
        // base case
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }

        int totalHeight = 0;
        // recursive work
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // self work
        if (leftHeight > totalHeight) {
            totalHeight = leftHeight;
        }
        if (rightHeight > totalHeight) {
            totalHeight = rightHeight;
        }
        return 1 + totalHeight;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
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

        System.out.print("height = " + height(root));
    }

}
