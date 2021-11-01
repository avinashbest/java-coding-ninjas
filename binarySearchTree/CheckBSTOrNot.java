package binarySearchTree;

import static binarySearchTree.SearchInBST.levelWiseInput;

public class CheckBSTOrNot {

    public static boolean checkBST(TreeNode<Integer> root) {
        if (root == null) return true;

        int leftMax = maximum(root.left);
        if (leftMax >= root.data) {
            return false;
        }

        int rightMin = minimum(root.right);
        if (rightMin < root.data) {
            return false;
        }

        return checkBST(root.left) && checkBST(root.right);
    }

    private static int minimum(TreeNode<Integer> root) {
        if (root == null) return Integer.MAX_VALUE;

        int left = minimum(root.left);
        int right = minimum(root.right);

        return Math.min(root.data, Math.min(left, right));
    }

    private static int maximum(TreeNode<Integer> root) {
        if (root == null) return Integer.MIN_VALUE;

        int left = maximum(root.left);
        int right = maximum(root.right);

        return Math.max(root.data, Math.max(left, right));
    }

    public static void main(String[] args) {
        var root = levelWiseInput();
        System.out.println(checkBST(root));
    }
}
