package dataStructure.tree;

import java.util.HashMap;


public class BuildTree {

  HashMap<Integer, Integer> inorderMap = new HashMap<>();

  int idx;

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    // build inorder hashMap for fast lookup

    for (int i = 0; i < inorder.length; i++) {
      inorderMap.put(inorder[i], i);
    }

    idx = postorder.length - 1;

    return helper(inorder, postorder, 0, inorder.length - 1);
  }

  private TreeNode helper(int[] inorder, int[] postorder, int start, int end) {
    if (start > end) {
      return null;
    }

    int rootValue = postorder[idx];

    TreeNode root = new TreeNode(rootValue);

    int rootValueIndex = inorderMap.get(rootValue);

    idx--;

    root.right = helper(inorder, postorder, rootValueIndex + 1, end);
    root.left = helper(inorder, postorder, start, rootValueIndex - 1);

    return root;
  }

  public static void main(String[] args) {
    // int[] inorder = { 9, 3, 15, 20, 7 };
    // int[] postorder = { 9, 15, 7, 20, 3 };

    int[] inorder = { 3, 2, 1 };
    int[] postorder = { 3, 2, 1 };

    // int[] inorder = { 1, 2, 3, 4 };
    // int[] postorder = { 2, 1, 4, 3 };

    BuildTree solution = new BuildTree();
    TreeNode root = solution.buildTree(inorder, postorder);

    TreeNode.inOrderPrint(root);
    // TreeNode.postOrderPrint(root);
  }
}
