package binarySearchTree;

import static binarySearchTree.SearchInBST.levelWiseInput;


class IsBSTReturn {
    int minimum;
    int maximum;
    boolean isBST;

    public IsBSTReturn(int minimum, int maximum, boolean isBST) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.isBST = isBST;
    }
}

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

    public static IsBSTReturn isBSTImproved(TreeNode<Integer> root) {
        if (root == null) {
            return new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }

        var left = isBSTImproved(root.left);
        var right = isBSTImproved(root.right);

        int minimum = Math.min(root.data, Math.min(left.minimum, right.minimum));
        int maximum = Math.max(root.data, Math.max(left.maximum, right.maximum));

        boolean isBST = left.maximum < root.data || right.minimum >= root.data || left.isBST || right.isBST;

        return new IsBSTReturn(minimum, maximum, isBST);
    }

    public static void main(String[] args) {
        var root = levelWiseInput();
//        System.out.println(checkBST(root));
        System.out.println(isBSTImproved(root).isBST);
    }
}
