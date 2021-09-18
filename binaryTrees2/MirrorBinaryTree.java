package binaryTrees2;

import binaryTrees1.BinaryTreeNode;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;

/*For a given Binary Tree of type integer, update it with its corresponding mirror image.
Example:
Alt text

Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints the mirrored tree in a level-wise order.
Each level will be printed on a new line. Elements printed at each level will be separated by a single line.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 1:
1
3 2
7 6 5 4
Sample Input 2:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 2:
5
6 10
3 2
9*/
public class MirrorBinaryTree {
    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("----------Original Tree----------");
        printBinaryTree(root);
        System.out.println("---------------------------------");
        mirrorBinaryTree(root);
        System.out.println("----------Modified Tree----------");
        printBinaryTree(root);
    }

    private static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) return;
        mirrorBinaryTree(root.right);
        mirrorBinaryTree(root.left);
//        Mirroring or Swapping
        var tmpLeft = root.left;
        root.left = root.right;
        root.right = tmpLeft;
    }
}
