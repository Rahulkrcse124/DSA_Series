public class Bn_01_Implementation {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayTree(Node root) {

        // base case
        if (root == null) {
            return;
        }

        // self work
        System.out.print(root.data + " -> ");
        if (root.left != null) {
            System.out.print(root.left.data + " , ");
        }
        if (root.right != null) {
            System.out.print(root.right.data + " ");
        }
        System.out.println();

        // recursive work
        displayTree(root.left);
        displayTree(root.right);
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

        displayTree(root);
    }
}