import java.util.*;

public class Bn_19_Dfs_InOrder {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static ArrayList<Integer> displayDfsInOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if (root == null) {
            return ans;
        }
        st.push(root);

        while (st.size() > 0) {

            Node temp = st.peek();

            if (temp.left != null) {
                st.push(temp.left);
                temp.left = null;
            } else {
                st.pop();
                ans.add(temp.data);
                if (temp.right != null) {
                    st.push(temp.right);
                }
            }
        }
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

        ArrayList<Integer> ans = displayDfsInOrder(root);
        System.out.print(ans + " ");

        // for (int fans : ans) {
        // System.out.print(fans + " ");
        // }
    }

}
