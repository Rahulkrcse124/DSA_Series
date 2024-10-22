import java.util.ArrayList;
import java.util.List;

public class Bn_04_LevelOrderTraversal_LC102 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int level(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = level(root.left);
        int rightHeight = level(root.right);

        int mh = 0;
        if (leftHeight > mh) {
            mh = leftHeight;
        }
        if (rightHeight > mh) {
            mh = rightHeight;
        }
        return 1 + mh;
    }

    public static void nthLevel(TreeNode root, int n, List<Integer> arr) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            arr.add(root.val);
        }
        nthLevel(root.left, n - 1, arr);
        nthLevel(root.right, n - 1, arr);
    }

    public static ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root) {
        int height = level(root);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= height; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            nthLevel(root, i, arr);
            ans.add(arr);
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        root.left = a;
        root.right = b;

        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        b.left = c;
        b.right = d;

        System.out.println(levelOrderTraversal(root));
        // output: [[3], [9, 20], [15, 7]]
    }
}
