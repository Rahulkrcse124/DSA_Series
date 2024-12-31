import java.util.ArrayList;

public class BST_15_postOrderPredSuces {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void postOrderPredSuces(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        postOrderPredSuces(root.left, arr);
        postOrderPredSuces(root.right, arr);
        arr.add(root.data);
    }

    public static void main(String[] args) {
        int target = 80;
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

        postOrder(root);
        System.out.println();

        postOrderPredSuces(root, arr);

        int indx = -1;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                indx = i;
                break;
            }
        }

        int pred = arr.get(indx - 1);
        int susc = arr.get(indx + 1);

        System.out.print("target is: " + target);
        System.out.println();
        System.out.print("postOrder predesessor:" + pred);
        System.out.println();
        System.out.println("postOrder Sucessor:" + susc);

    }

}
