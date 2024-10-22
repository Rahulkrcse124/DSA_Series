public class Bn_07_BinaryTree_RightSideView_LT199 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void rightView(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        if (root.right != null) {
            rightView(root.right);
        } else {
            rightView(root.left);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(5);
        a.right = c;

        Node d = new Node(4);
        b.right = d;

        rightView(root);
    }
}
