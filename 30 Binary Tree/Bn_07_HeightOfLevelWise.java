public class Bn_07_HeightOfLevelWise {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }

    public static int height(Node root) {
        int totalMax = 0;
        // base case
        if (root == null) {
            return 0;
        }

        // recursive work
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // self work

        if (leftHeight > totalMax) {
            totalMax = leftHeight;
        }
        if (rightHeight > totalMax) {
            totalMax = rightHeight;
        }

        return 1 + totalMax;
    }

    public static int height2(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height2(root.left);
        int rightHeight = height2(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
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
        display(root);

        System.out.println();
        System.out.println();

        System.out.print("height of tree : " + height(root));

        System.out.println();
        System.out.println();
        System.out.print("height: " + height2(root));

    }

}
