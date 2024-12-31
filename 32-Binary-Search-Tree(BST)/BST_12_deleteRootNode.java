import java.util.LinkedList;
import java.util.Queue;

public class BST_12_deleteRootNode {

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

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node deleteRootNode(Node root) {
        if (root == null) {
            return null; // No node to delete
        }

        // Case 1: Node has no children
        if (root.left == null && root.right == null) {
            return null;
        }

        // Case 2: Node has one child
        if (root.left == null) {
            return root.right; // Replace with right child
        }
        if (root.right == null) {
            return root.left; // Replace with left child
        }

        // Case 3: Node has two children
        // Find the in-order successor (smallest in the right subtree)
        Node successorParent = root;
        Node successor = root.right;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        // Replace root's value with the successor's value
        root.data = successor.data;

        // Delete the successor node
        if (successorParent.left == successor) {
            successorParent.left = successor.right;
        } else {
            successorParent.right = successor.right;
        }

        return root;
    }

    public static void main(String args[]) {
        String arr[] = { "5", "3", "6", "2", "4", "", "7" };
        Node root = constTructTree(arr);

        inOrder(root);

        // after delete the root node

        System.out.println();
        System.out.println();
        deleteRootNode(root);
        inOrder(root);

    }

}
