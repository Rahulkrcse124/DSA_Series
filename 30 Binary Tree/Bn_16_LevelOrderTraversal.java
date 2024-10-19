public class Bn_16_LevelOrderTraversal {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int level(Node root) {

        if (root == null) {
            return 0;
        }

        int finalHeight = 0;
        int leftHeight = level(root.left);
        int rightHeight = level(root.right);

        if (leftHeight > finalHeight) {
            finalHeight = leftHeight;
        }
        if (rightHeight > leftHeight) {
            leftHeight = rightHeight;
        }
        return 1 + finalHeight;
    }

    public static void levelOrder(Node root) {
        int length = level(root);

        // base case
        if (root == null) {
            return;
        }
        if (length == 0) {
            return;
        }

        // self work
        System.out.print(root.data + " ");

        // recursive work
        length--;
        levelOrder(root.left);
        levelOrder(root.right);

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

        // levelOrder(root);
        System.out.println(level(root));

        System.out.println();
        System.out.println();
        levelOrder(root);
    }

}
