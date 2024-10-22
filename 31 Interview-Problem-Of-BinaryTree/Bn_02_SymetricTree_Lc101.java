public class Bn_02_SymetricTree_Lc101 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.data != q.data)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static Node invertTree(Node root) {
        if (root == null)
            return root;
        Node leftNode = root.left;
        Node rightNode = root.right;
        root.left = invertTree(rightNode);
        root.right = invertTree(leftNode);
        return root;
    }

    public static boolean isSymmetric(Node root) {

        if (root == null)
            return true;
        root.left = invertTree(root.left);
        return isSameTree(root.left, root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(2);

        root.left = a;
        root.right = b;

        Node c = new Node(3);
        Node d = new Node(4);
        a.left = c;
        a.right = d;

        Node e = new Node(4);
        Node f = new Node(3);
        b.left = e;
        b.right = f;

        Node g = new Node(2);
        c.right = g;

        Node h = new Node(2);
        f.left = h;

        System.out.println(isSameTree(g, h));
    }

}
