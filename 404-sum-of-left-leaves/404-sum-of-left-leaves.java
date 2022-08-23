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
    int ans= 0;
    public int sumOfLeftLeaves(TreeNode root) {
        inorder(root,0);
        return ans;
    }
    public void inorder(TreeNode root,int type){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null && type==1){
            ans += root.val;
        }
        inorder(root.left,1);
        inorder(root.right,2);
    }
}