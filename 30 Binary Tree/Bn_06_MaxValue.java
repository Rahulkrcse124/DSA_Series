public class Bn_06_MaxValue {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int max(Node root) {
        int max = 0;

        // base case
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        // recursive work
        int rootValue = root.data;
        int leftValue = max(root.left);
        int rightValue = max(root.right);

        // self work
        if (rootValue > max) {
            max = rootValue;
        }
        if (leftValue > max) {
            max = leftValue;
        }
        if (rightValue > max) {
            max = rightValue;
        }

        return max;
    }

    public static int maxValue2Method(Node root) {
        if (root == null) {
            return 0;
        }

        int rootValue = root.data;
        int leftMax = maxValue2Method(root.left);
        int rightMax = maxValue2Method(root.right);

        return Math.max(rootValue, Math.max(leftMax, rightMax));

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

        System.out.print("max value is: " + max(root));

        System.out.println();
        System.out.println();
        System.out.println("max 2nd method");
        System.out.print("max value is: " + maxValue2Method(root));

    }

}
