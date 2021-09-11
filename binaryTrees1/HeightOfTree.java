package binaryTrees1;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;
/*For a given Binary Tree of integers, find and return the height of the tree.
Example:
                        10
                      /      \
                    20      30
                   /    \
                 40    50

Height of the given tree is 3.

Height is defined as the total number of nodes along the longest path from the root to any of the leaf node.
 Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The first and the only line of output prints the height of the given binary tree.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
10 20 30 40 50 -1 -1 -1 -1 -1 -1
Sample Output 1:
3
Sample Input 2:
3 -1 -1
Sample Output 2:
1*/
public class HeightOfTree {

    public static int heightOfTree(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("----------The Tree is----------");
        printBinaryTree(root);
        System.out.println("-------------------------------");
        System.out.println("Height of the Tree is = " + heightOfTree(root));
    }
}
