import java.util.LinkedList;
import java.util.Queue;

public class BST_13_lowestCommonAncesstor_LT235 {

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

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (p.data == root.data || q.data == root.data) {
            return root;
        }

        if (p.data > root.data && q.data < root.data) {
            return root;
        }

        else if (p.data < root.data && q.data > root.data) {
            return root;
        }

        else if (q.data < root.data && p.data < root.data) {
            return lowestCommonAncestor(root.left, p, q);
        }

        else if (p.data > root.data && q.data > root.data) {
            return lowestCommonAncestor(root.right, p, q);
        }

        else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }

    public static void main(String[] args) {

        String arr[] = { "50", "20", "60", "17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14" };
        Node root = constTructTree(arr);
        Node p = new Node(17);
        Node q = new Node(28);

        Node ancestor = lowestCommonAncestor(root, p, q);
        System.out.println(ancestor.data);

    }
}