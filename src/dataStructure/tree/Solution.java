package dataStructure.tree;

public class Solution {

  public void preOrderPrint(TreeNode root) {
    if (root == null) return;

    System.out.println(root.val);

    preOrderPrint(root.left);
    preOrderPrint(root.right);
  }


  

  public static void main(String[] args) {
    // Solution solution = new Solution();

    // TreeNode root = new TreeNode(1);

    // root.left = new TreeNode(2);
    // root.right = new TreeNode(2);

    // root.left.left = new TreeNode(3);
    // root.left.right = new TreeNode(4);


    // root.right.left = new TreeNode(4);
    // root.right.right = new TreeNode(3);

    // solution.preOrderPrint(root);
  }
}


class MyTuple{
  int count;
  boolean isUni;

  MyTuple(int count, boolean isUni){
    this.count = count;
    this.isUni = isUni;
  }
}