import java.util.LinkedList;
import java.util.Queue;

public class BST_17_deletePredInOrder {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }


    static int pred = -1;
    static int sus = -1;
    static Node temp = null;
    static boolean flag = false;


    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int maxHeight = 0;
        if (leftHeight > maxHeight) {
            maxHeight = leftHeight;
        }
        if (rightHeight > maxHeight) {
            maxHeight = rightHeight;
        }

        return 1 + maxHeight;
    }

    public static void levelOrder(Node root, int n) {
        if (root == null) {
            return;
        }
        if (n == 0) {
            return;
        }
        if (n == 1) {
            System.out.print(root.data + " ");
        }
        levelOrder(root.left, n - 1);
        levelOrder(root.right, n - 1);
    }

    public static Node constTructTree(String[] arr) {

        Queue<Node> q = new LinkedList<>();
        int value = Integer.parseInt(arr[0]);
        Node root = new Node(value);
        q.add(root);

        int i = 1;
        int n = arr.length;

        while (i < n) {
            Node temp = q.remove();

            Node leftNode = new Node(100);// dummy leftNode
            Node rightNode = new Node(100); // dummyNode

            if (arr[i].equals("")) {
                leftNode = null;
            } else {
                int leftValue = Integer.parseInt(arr[i]);
                leftNode.data = leftValue;
                q.add(leftNode);
            }

            if (arr[i + 1].equals("")) {
                rightNode = null;
            } else {
                int rightValue = Integer.parseInt(arr[i + 1]);
                rightNode.data = rightValue;
                q.add(rightNode);
            }

            temp.left = leftNode;
            temp.right = rightNode;

            i = i + 2;
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void predSus(Node root, int val) {

        if (root == null) {
            return;
        }

        predSus(root.left, val);

        if(temp == null) {
            temp = root;
        }

        else{
            if(root.data == val) {
                pred = temp.data;
                flag = true;
            }
            else if(root.data > val && flag == true) {
                sus = root.data;
                flag = false;  
            }
        }

        temp = root;
        predSus(root.right, val);
    }


    public static void main(String[] args) {
        String arr[] = { "50", "20", "60", "17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14" };
        int value = 34;
        Node root = constTructTree(arr);
        System.out.print("value is : "+ value);
        System.out.println();

        System.out.print("inorder");
        inOrder(root);

        System.out.println();

        predSus(root, value);
        System.out.print("predecssor: "+pred);
        System.out.println();
        System.out.print("suscessor:" + sus);


    }
}
