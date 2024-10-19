public class Bn_22_Diameter_Lt543 {

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

        // recursive work
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // self work
        int maxHeight = 0;
        if (leftHeight > maxHeight) {
            maxHeight = leftHeight;
        }
        if (rightHeight > maxHeight) {
            maxHeight = rightHeight;
        }
        return 1 + maxHeight;
    }

    public static int diameter(Node root) {

        if (root == null || root.left == null && root.right == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 2 + leftHeight + rightHeight;

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
        b.left = e;

        Node f = new Node(7);
        Node g = new Node(8);
        d.left = f;
        d.right = g;

        System.out.print("Height = " + height(root));

        System.out.println();
        System.out.println();
        System.out.println(diameter(root));

    }

}
