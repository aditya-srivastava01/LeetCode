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
    int depth = 0;
    public int maxDepth(TreeNode root) {
        inorder(root,0);
        return depth;
    }
    public void inorder(TreeNode root,int d){
        if(root==null){
            return;
        }
        d++;
        depth = Math.max(depth,d);
        inorder(root.left,d);
        inorder(root.right,d);
    }
}