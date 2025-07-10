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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return ans;
    }
    private int solve(TreeNode root){
        if(root==null) return 0;

        int l = Math.max(solve(root.left),0);
        int r = Math.max(solve(root.right),0);

        int curr=l+r+root.val;
        ans=Math.max(curr,ans);
        return Math.max(l,r)+root.val;
    }
}