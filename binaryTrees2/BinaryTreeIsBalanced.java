package binaryTrees2;

import binaryTrees1.BinaryTreeNode;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;

class BalancedTreeReturn {
    int height;
    boolean isBalanced;
}

public class BinaryTreeIsBalanced {

    /*
     * Time Complexity: O(n)
     * */
    public static BalancedTreeReturn isBalancedTreeOptimized(BinaryTreeNode<Integer> root) {
        if (root == null) {
            var answer = new BalancedTreeReturn();
            answer.height = 0;
            answer.isBalanced = false;
            return answer;
        }

        var leftOutput = isBalancedTreeOptimized(root.left);
        var rightOutput = isBalancedTreeOptimized(root.right);

//        Assuming given tree is balanced
        boolean isBalanced = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
            isBalanced = false;
        }
        if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
            isBalanced = false;
        }

        var answer = new BalancedTreeReturn();
        answer.height = height;
        answer.isBalanced = isBalanced;
        return answer;
    }

    /*
     * Time Complexity: O(n * h) , where n = no. of nodes & h = height of the tree.
     * Worst Case -> Skewed Tree: O(n^2) => T(n) = k*n + T(n - 1)
     * Best Case -> Balanced Tree: O(n*logn) => T(n) = k*n + 2*T(n/2)
     * */
    public static boolean isBalancedTree(BinaryTreeNode<Integer> root) {
        if (root == null) return true;
//        Getting the height of the tree
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
//        If the absolute value of leftHeight - rightHeight is greater than 1 then the tree is not balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
//        Otherwise: Checking on the root's left && root's right, Both of them are true, then the tree is balanced
        return isBalancedTree(root.left) && isBalancedTree(root.right);
    }

    private static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("----------Original Tree----------");
        printBinaryTree(root);
        System.out.println("---------------------------------");
        System.out.println(isBalancedTree(root));
        System.out.println("---------------------------------");
        System.out.println(isBalancedTreeOptimized(root).isBalanced);
    }
}
