
public class Bn_23_LowestCommonAncestor {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean contains(Node root, Node node) {
        if (root == null)
            return false;
        if (root == node)
            return true;
        return contains(root.left, node) || contains(root.right, node);
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;

        boolean leftp = contains(root.left, p);
        boolean leftq = contains(root.left, q);

        if (leftp != leftq)
            return root;

        if (leftp) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(7);
        b.right = e;

        Node f = new Node(6);
        d.left = f;

        Node g = new Node(18);
        Node h = new Node(10);
        e.left = g;
        e.right = h;

        // Example: Find LCA of d (5) and f (6)
        Node lca = lowestCommonAncestor(root, d, f);
        if (lca != null) {
            System.out.println("LCA of " + d.data + " and " + f.data + " is: " + lca.data);
        } else {
            System.out.println("LCA not found");
        }

        // Example: Find LCA of e (7) and h (10)
        lca = lowestCommonAncestor(root, e, h);
        if (lca != null) {
            System.out.println("LCA of " + e.data + " and " + h.data + " is: " + lca.data);
        } else {
            System.out.println("LCA not found");
        }
    }
}
