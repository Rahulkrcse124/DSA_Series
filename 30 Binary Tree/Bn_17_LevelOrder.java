import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Bn_17_LevelOrder {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static ArrayList<ArrayList<Integer>> level(Node root) {

        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> finalAns = new ArrayList<>();

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
            int value = temp.data;
            ans.add(value);
            q.remove();
        }
        finalAns.add(ans);

        return finalAns;

    }

    public static void main(String[] args) {
        Node root = new Node(3);

        Node a = new Node(9);
        Node b = new Node(20);
        root.left = a;
        root.right = b;

        Node c = new Node(15);
        Node d = new Node(17);
        b.left = c;
        b.right = d;

        ArrayList<ArrayList<Integer>> ans = level(root);
        System.out.print(ans + " ");

    }

}
