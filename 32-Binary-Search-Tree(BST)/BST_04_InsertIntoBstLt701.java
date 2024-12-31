public class BST_04_InsertIntoBstLt701 {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insertIntoBst(Node root, int newVal) {

        if (root == null) {
            return new Node(newVal);
        }

        if (root.data > newVal) {
            if (root.left == null) {
                root.left = new Node(newVal);
            } else {
                insertIntoBst(root.left, newVal);
            }
        }

        if (root.data < newVal) {
            if (root.right == null) {
                root.right = new Node(newVal);
            } else {
                insertIntoBst(root.right, newVal);
            }
        }

        return root;
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        int newVal = 5;

        Node a = new Node(2);
        Node b = new Node(7);

        root.left = a;
        root.right = b;

        Node c = new Node(1);
        Node d = new Node(3);
        a.left = c;
        a.right = d;

        System.out.println("before insertion BST");
        display(root);

        System.out.println();
        System.out.println("after Insertion BST");
        Node rootNode = insertIntoBst(root, newVal);
        display(rootNode);

    }
}