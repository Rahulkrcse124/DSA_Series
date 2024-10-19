import java.util.*;

public class Bn_18_BFS {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void levelOrderBfs(Node root) {

        Queue<Node> q = new LinkedList<>();

        if (root != null) {
            q.add(root);
        }

        while (q.size() > 0) {
            Node temp = q.peek();

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }

            System.out.println(temp.data + " ");
            q.remove();
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

        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        levelOrderBfs(root);

    }

}
