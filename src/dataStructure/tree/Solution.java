package dataStructure.tree;

public class Solution {

  public void preOrderPrint(TreeNode root) {
    if (root == null) return;

    System.out.println(root.val);

    preOrderPrint(root.left);
    preOrderPrint(root.right);
  }

  public int find_sum(TreeNode node) {
    if (node == null) {
      return 0;
    }

    return find_sum(node.left) + find_sum(node.right) + node.val;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(2);

    root.left = new TreeNode(3);
    root.right = new TreeNode(4);

    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(6);

    // root.right.left = new TreeNode(4);
    // root.right.right = new TreeNode(3);

    int sum = solution.find_sum(root);

    System.out.println(sum);
  }
}













class MyTuple {
  int count;
  boolean isUni;

  MyTuple(int count, boolean isUni) {
    this.count = count;
    this.isUni = isUni;
  }
}
