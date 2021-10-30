package dataStructure.tree;

public class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public static void inOrderPrint(TreeNode root) {
    if (root == null) return;

    inOrderPrint(root.left);
    System.out.println(root.val);
    inOrderPrint(root.right);
  }

  public static void postOrderPrint(TreeNode root) {
    if (root == null) return;

    postOrderPrint(root.left);
    postOrderPrint(root.right);

    System.out.println(root.val);
  }

  public static void preOrderPrint(TreeNode root) {
    if (root == null) return;

    System.out.println(root.val);

    preOrderPrint(root.left);
    preOrderPrint(root.right);
  }
}
