/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean ans = false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) {
            return ans;
        }
        if (root.val == subRoot.val && solve(root, subRoot)) {
            ans = true;
            ;
        } else {
            isSubtree(root.left, subRoot);
            isSubtree(root.right, subRoot);
        }
        return ans;
    }

    private boolean solve(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) {
            if (subRoot == null && root == null)
                return true;
            else
                return false;
        }
        if (root.val == subRoot.val) {
            return solve(root.right, subRoot.right) && solve(root.left, subRoot.left);
        } else
            return false;
    }
}