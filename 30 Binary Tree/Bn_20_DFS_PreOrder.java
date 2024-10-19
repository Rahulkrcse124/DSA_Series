import java.util.ArrayList;
// import java.util.Stack;

public class Bn_20_DFS_PreOrder {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayPreOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        displayPreOrder(root.left);
        displayPreOrder(root.right);
    }

    public static ArrayList<Integer> DfsPreOrder() {

        ArrayList<Integer> ans = new ArrayList<>();
        // Stack<Node> st = new Stack<>();

        return ans;
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

        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        Node g = new Node(8);
        c.right = g;

        displayPreOrder(root);
    }

}
