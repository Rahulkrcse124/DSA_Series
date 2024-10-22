import java.util.LinkedList;
import java.util.Queue;

public class Bn_06_BoundryTree {

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
            Node leftNode = null;
            Node rightNode = null;

            if (!arr[i].equals(" ")) {
                int leftValue = Integer.parseInt(arr[i]);
                leftNode = new Node(leftValue);
                q.add(leftNode);
            }

            if (i + 1 < n && !arr[i + 1].equals(" ")) {
                int rightValue = Integer.parseInt(arr[i + 1]);
                rightNode = new Node(rightValue);
                q.add(rightNode);
            }

            temp.left = leftNode;
            temp.right = rightNode;

            i = i + 2;
        }
        return root;
    }

    public static void leftBoundry(Node root) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }

        System.out.print(root.data + " ");

        if (root.left != null) {
            leftBoundry(root.left);
        } else {
            leftBoundry(root.right);
        }
    }

    public static void rootBoundry(Node root) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        rootBoundry(root.left);
        rootBoundry(root.right);
    }

    public static void reverseRightBoundry(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }

        if (root.right != null) {
            reverseRightBoundry(root.right);
        } else {
            reverseRightBoundry(root.left);
        }

        System.out.print(root.data + " ");
    }

    public static void displayBoundry(Node root) {

        System.out.print(root.data + " ");
        leftBoundry(root.left);
        rootBoundry(root);
        reverseRightBoundry(root.right);

        /*
         * // 2nd method
         * leftBoundry(root);
         * rootBoundry(root);
         * reverseRightBoundry(root);
         * 
         */
    }

    public static void main(String[] args) {

        String arr[] = {
                "1", "2", "3", "4", "5", "6", " ", "7", "8", "9", "10", " ", "13", "14", " ", "11", "12", " ",
                " ", " ", " ", "18", " ", " ", " ", "15", "16", "17", " ", "21", "22", "23", " ", "19", " ", "20", " ",
                "25", "26", "27", "28", "29"
        };

        System.out.println("construct Tree");
        Node root = constTructTree(arr);
        int length = height(root);
        for (int i = 1; i <= length; i++) {
            levelOrder(root, i);
            System.out.println();
        }

        // System.out.println();
        // System.out.println("Boundry Tree left");
        // leftBoundry(root);

        // System.out.println();
        // rootBoundry(root);

        // System.out.println();
        // System.out.println();
        // reverseRightBoundry(root);

        System.out.println();
        System.out.println("display Boundry");
        displayBoundry(root);
    }
}
