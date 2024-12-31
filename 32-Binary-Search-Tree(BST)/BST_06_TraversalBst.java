import java.util.LinkedList;
import java.util.Queue;

public class BST_06_TraversalBst {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int maxHeight = 0;
        if (leftHeight > maxHeight) {
            maxHeight = leftHeight;
        }
        if (rightHeight > maxHeight) {
            maxHeight = rightHeight;
        }

        return 1 + maxHeight;
    }

    public static void levelOrder(Node root, int n) {
        if (root == null) {
            return;
        }
        if (n == 0) {
            return;
        }
        if (n == 1) {
            System.out.print(root.data + " ");
        }
        levelOrder(root.left, n - 1);
        levelOrder(root.right, n - 1);
    }

    public static Node constTructTree(String[] arr) {

        Queue<Node> q = new LinkedList<>();
        int value = Integer.parseInt(arr[0]);
        Node root = new Node(value);
        q.add(root);

        int i = 1;
        int n = arr.length;

        while (i < n) {
            Node temp = q.remove();

            Node leftNode = new Node(100);// dummy leftNode
            Node rightNode = new Node(100); // dummyNode

            if (arr[i].equals("")) {
                leftNode = null;
            } else {
                int leftValue = Integer.parseInt(arr[i]);
                leftNode.data = leftValue;
                q.add(leftNode);
            }

            if (arr[i + 1].equals("")) {
                rightNode = null;
            } else {
                int rightValue = Integer.parseInt(arr[i + 1]);
                rightNode.data = rightValue;
                q.add(rightNode);
            }

            temp.left = leftNode;
            temp.right = rightNode;

            i = i + 2;
        }
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        // String[] arr = { "1", "2", "3", "4", "5", "", "6", "", "7", "", "", "8", "",
        // "", "", "9", "" };

        String arr[] = { "10", "5", "15", "2", "8", "12", "17" };

        Node root = constTructTree(arr);

        System.out.println("preorder BST is: ");
        preOrder(root);

        System.out.println();
        System.out.println();

        System.out.println("postOrder Bst is");
        postOrder(root);

        System.out.println();
        System.out.println();

        System.out.println("inOrder BST is");
        inOrder(root);
        // int length = height(root);

    }

}
