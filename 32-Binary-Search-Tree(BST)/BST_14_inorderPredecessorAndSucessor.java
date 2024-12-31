import java.util.ArrayList;

public class BST_14_inorderPredecessorAndSucessor {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void predecessorAndSuccesor(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        predecessorAndSuccesor(root.left, arr);
        arr.add(root.data);
        predecessorAndSuccesor(root.right, arr);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Node root = new Node(50);
        int target = 50;

        Node a = new Node(30);
        Node b = new Node(70);
        root.left = a;
        root.right = b;

        Node c = new Node(20);
        Node d = new Node(40);
        a.left = c;
        a.right = d;

        Node e = new Node(60);
        Node f = new Node(80);
        b.left = e;
        b.right = f;

        inorder(root);

        System.out.println();

        predecessorAndSuccesor(root, arr);

        int idx = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                idx = i;
                break;
            }
        }

        int pred = arr.get(idx - 1);
        int suces = arr.get(idx + 1);

        System.out.print("target is : " + target);
        System.out.println();
        System.out.print("predecessor:" + pred);
        System.out.println();
        System.out.print("sucessor:" + suces);
    }

}
