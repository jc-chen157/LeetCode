package easy;

import utils.TreeNode;

public class Num101_SymmetricTree {

  public boolean isSymmetric(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return true;
    }
    if (root.left == null || root.right == null) {
      return false;
    }
    return isSymmetric(root.left, root.right);
  }

  public boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    if (left.val != right.val) {
      return false;
    }

    return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
  }
}