public class Bn_04_DisplayPreOrder {
    static int size = 0;

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void preOrderDisplay(Node root) {
        // base case
        if (root == null) {
            return;
        }

        // self work
        System.out.print(root.data + " ");
        size++;

        // recursive work
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);
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

        preOrderDisplay(root);

        System.out.println();
        System.out.println("size of tree: " + size);

    }

}
