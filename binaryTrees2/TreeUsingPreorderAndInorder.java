package binaryTrees2;

import binaryTrees1.BinaryTreeNode;

import java.util.Scanner;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;

public class TreeUsingPreorderAndInorder {

    private static BinaryTreeNode<Integer> buildTreeHelper(
            int[] preOrder,
            int preOrderStart,
            int preOrderEnd,
            int[] inOrder,
            int inOrderStart,
            int inOrderEnd
    ) {
        if (preOrderStart > preOrderEnd || inOrderStart > inOrderEnd) return null;

        int rootValue = preOrder[preOrderStart];
        var root = new BinaryTreeNode<Integer>(rootValue);

//        Find root element index from inOrder[]
        int k = 0;
        for (int i = inOrderStart; i <= inOrderEnd; i++) {
            if (rootValue == inOrder[i]) {
                k = i;
                break;
            }
        }
//        Recursion: Handling later on
        root.left = buildTreeHelper(preOrder, preOrderStart + 1, preOrderStart + (k - inOrderStart), inOrder, inOrderStart, k - 1);
        root.right = buildTreeHelper(preOrder, preOrderStart + (k - inOrderStart) + 1, preOrderEnd, inOrder, k + 1, inOrderEnd);

        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        return buildTreeHelper(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private static int[] takingInput(String listName) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of the list " + listName + ": ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] preOrder = takingInput("Preorder");
        int[] inOrder = takingInput("Inorder");
        System.out.println("Processing Binary Tree: Building the Tree...");
        var root = buildTree(preOrder, inOrder);
        System.out.println("--------------------------------------------");
        printBinaryTree(root);
    }
}
