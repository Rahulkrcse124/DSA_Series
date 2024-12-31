import java.util.LinkedList;
import java.util.Queue;

public class BST_10_deleteNodeHas2Child {

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

    public static void deleteNodeHas2Child(Node root, int target) {

        if (root == null) {
            return;
        }

        if (root.data > target) { // target = 28
            if (root.left.data == target) {
                Node leftNode = root.left;

                if (leftNode.left.left == null && leftNode.left.right == null && leftNode.right.left == null
                        && leftNode.right.right == null) {

                    Node lLNode = root.left.left;
                    Node lRNode = root.left.right;
                    root.left = lLNode;
                    root.left.left = lRNode;
                }
            } else {
                deleteNodeHas2Child(root.left, target);
            }
        }

        if (root.data < target) { // target = 60
            if (root.right.data == target) {
                Node rightNode = root.right;

                if (rightNode.left.left == null && rightNode.left.right == null && rightNode.right.left == null
                        && rightNode.right.right == null) {

                    Node rLNode = root.right.left;
                    Node rRNode = root.right.right;
                    root.right = rRNode;
                    root.right.left = rLNode;
                }
            } else {
                deleteNodeHas2Child(root.right, target);
            }
        }
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

        String arr[] = { "50", "28", "60", "17", "34", "55", "89" };
        int target = 60;
        Node root = constTructTree(arr);
        inOrder(root);

        System.out.println();
        System.out.println();
        System.out.println("after delete the Target Node: BST is: ");
        deleteNodeHas2Child(root, target);
        inOrder(root);
    }
}
