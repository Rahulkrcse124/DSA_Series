public class Bn_02_Implementation {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayTree(Node root) {
        // base case
        if (root == null) {
            return;
        }

        // self work
        System.out.print(root.data + " -> ");

        if (root.left != null) {
            System.out.print(root.left.data + " , ");
        } else {
            System.out.print("Null , ");
        }

        if (root.right != null) {
            System.out.print(root.right.data + " ");
        } else {
            System.out.print("Null");
        }

        System.out.println(" ");

        // recursive work
        displayTree(root.left);
        displayTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);

        root.left = a;
        root.right = b;

        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(11);
        b.right = e;

        displayTree(root);

        /*
         * output
         * 
         * 2 -> 4 , 10
         * 4 -> 6 , 5
         * 6 -> Null , Null
         * 5 -> Null , Null
         * 10 -> Null , 11
         * 11 -> Null , Null
         * 
         */
    }

}
