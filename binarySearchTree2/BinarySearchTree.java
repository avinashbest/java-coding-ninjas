package binarySearchTree2;

/*
Implement the BST class which includes following functions -
1. search - Given an element, find if that is present in BST or not. Return true or false.
2. insert - Given an element, insert that element in the BST at the correct position. Assume unique elements will be given.
3. delete - Given an element, remove that element from the BST. If the element which is to be deleted has both children, replace that with the minimum element from right sub-tree.
4. printTree (recursive) - Print the BST in the following format -
For printing a node with data N, you need to follow the exact format -
N:L:x,R:y
where, N is data of any node present in the binary tree. x and y are the values of left and right child of node N. Print the children only if it is not null.
There is no space in between.
You need to print all nodes in the recursive format in different lines.
* */

class BinarySearchTreeDeleteReturn {
    TreeNode<Integer> root;
    boolean deleted;

    public BinarySearchTreeDeleteReturn(TreeNode<Integer> root, boolean deleted) {
        this.root = root;
        this.deleted = deleted;
    }
}

public class BinarySearchTree {
    private TreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(TreeNode<Integer> node, int x) {
        if (node == null) return false;

        if (node.data == x) return true;

        if (x < node.data) return isPresentHelper(node.left, x);
        else return isPresentHelper(node.right, x);
    }

    /*
     * O(height)
     * */
    public boolean isPresent(int data) {
        return isPresentHelper(root, data);
    }

    private static TreeNode<Integer> insertHelper(TreeNode<Integer> node, int data) {
        if (node == null) return new TreeNode<>(data);

        if (data >= node.data) {
            node.right = insertHelper(node.right, data);
        } else {
            node.left = insertHelper(node.left, data);
        }

        return node;
    }

    /*
     * O(height)
     * */
    public void insert(int data) {
        root = insertHelper(root, data);
        size++;
    }

    private static BinarySearchTreeDeleteReturn deleteDataHelper(
            TreeNode<Integer> node,
            int x
    ) {
        if (node == null) return new BinarySearchTreeDeleteReturn(null, false);

        if (node.data < x) {
            var right = deleteDataHelper(node.right, x);
            node.right = right.root;
            right.root = node;
            return right;
        }

        if (node.data > x) {
            var left = deleteDataHelper(node.left, x);
            node.left = left.root;
            left.root = node;
            return left;
        }
//        0 Children
        if (node.left == null && node.right == null) return new BinarySearchTreeDeleteReturn(null, true);
//        Only left Children
        if (node.left != null && node.right == null) return new BinarySearchTreeDeleteReturn(node.left, true);
//        Only right Children
        if (node.left == null) return new BinarySearchTreeDeleteReturn(node.right, true);
//        Both the Children are Present
        int rightMinimum = minimum(node.right);
        node.data = rightMinimum;
        var outputRight = deleteDataHelper(node.right, rightMinimum);
        node.right = outputRight.root;
        return new BinarySearchTreeDeleteReturn(node, true);
    }

    private static int minimum(TreeNode<Integer> root) {
        if (root == null) return Integer.MAX_VALUE;

        int left = minimum(root.left);
        int right = minimum(root.right);

        return Math.min(root.data, Math.min(left, right));
    }

    /*
     * O(2 * height)
     * */
    public boolean deleteData(int data) {
        var output = deleteDataHelper(root, data);
        root = output.root;
        if (output.deleted) size--;
        return output.deleted;
    }

    /*
     * O(1)
     * */
    public int size() {
        return size;
    }

    private static void printTreeHelper(TreeNode<Integer> node) {
        if (node == null) return;

        System.out.print(node.data + " : ");

        if (node.left != null) System.out.print("Left -> " + node.left.data + ", ");
        if (node.right != null) System.out.print("Right -> " + node.right.data);

        System.out.println();

        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }

    /*
     * O(n)
     * */
    public void printTree() {
        printTreeHelper(root);
    }
}