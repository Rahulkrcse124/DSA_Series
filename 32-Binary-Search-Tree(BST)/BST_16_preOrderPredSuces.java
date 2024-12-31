import java.util.ArrayList;

public class BST_16_preOrderPredSuces {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void predSusce(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.data);
        predSusce(root.left, arr);
        predSusce(root.right, arr);
    }

    public static void main(String[] args) {
        int target = 40;
        ArrayList<Integer> arr = new ArrayList<>();

        Node root = new Node(50);

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

        preOrder(root);
        System.out.println();

        predSusce(root, arr);
        int indx = -1;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                indx = i;
                break;
            }
        }

        int pred = arr.get(indx - 1);
        int suces = arr.get(indx + 1);

        System.out.print("target:" + target);
        System.out.println();

        System.out.print("predecessor: " + pred);
        System.out.println();

        System.out.print("suscessor:" + suces);

    }

}
