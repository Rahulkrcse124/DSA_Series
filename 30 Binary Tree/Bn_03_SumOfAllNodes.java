public class Bn_03_SumOfAllNodes {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int sum(Node root) {
        // base case
        if (root == null) {
            return 0;
        }

        // recursive work
        int rootvalue = root.data;
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        int finalsum = rootvalue + leftSum + rightSum;
        return finalsum;
    }

    public static int sum2(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum2(root.left) + sum2(root.right);
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

        System.out.println(sum(root));

        System.out.println();
        System.out.println("2nd method of sum");
        System.out.println(sum2(root));
    }

}
