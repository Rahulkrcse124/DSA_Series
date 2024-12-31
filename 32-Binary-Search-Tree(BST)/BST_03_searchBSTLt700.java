public class BST_03_searchBSTLt700 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean search(Node root, int target) {

        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        if (root.data > target) {
            return search(root.left, target);
        }
        if (root.data < target) {
            return search(root.right, target);
        }
        return false;
    }

    public static Node searchNode(Node root, int target) {

        if (root == null) {
            return null;
        }
        if (root.data == target) {
            return root;
        }

        if (root.data > target) {
            return searchNode(root.left, target);
        }

        if (root.data < target) {
            return searchNode(root.right, target);
        }

        return root;

    }

    public static void main(String[] args) {

        Node root = new Node(50);
        int target = 34;

        Node a = new Node(20);
        Node b = new Node(60);

        root.left = a;
        root.right = b;

        Node c = new Node(17);
        Node d = new Node(34);
        Node e = new Node(55);
        Node f = new Node(89);

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;

        Node g = new Node(10);
        Node h = new Node(28);
        Node i = new Node(70);

        c.left = g;
        d.left = h;
        f.left = i;

        Node j = new Node(14);
        g.right = j;

        // check avilable or not
        System.out.println(search(root, target));

        System.out.println();
        System.out.println("if exist then print root otherwise not print");
        Node ans = searchNode(root, target);
        if (ans == null) {
            System.out.println("null");
        } else {
            System.out.println(ans.data);
        }

    }
}
