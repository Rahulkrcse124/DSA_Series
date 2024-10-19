public class Bn_05_Size {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayPreOrder(Node root) {
        // base case
        if (root == null) {
            return;
        }

        // self work
        System.out.print(root.data + " ");

        // recursive work
        displayPreOrder(root.left);
        displayPreOrder(root.right);
    }

    public static int size(Node root) {

        if (root == null) {
            return 0;
        }

        int leftSize = size(root.left);
        int rightSize = size(root.right);

        int totalSize = 1 + leftSize + rightSize;

        return totalSize;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);

        root.left = a;
        root.right = b;

        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(11);
        b.right = e;

        displayPreOrder(root);

        System.out.println();

        System.out.print("size of Tree: " + size(root));

    }

}
