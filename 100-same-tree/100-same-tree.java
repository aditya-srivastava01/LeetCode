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
    boolean ans = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inorder(p,q);
        return ans;
    }
    public void inorder(TreeNode root,TreeNode head){
        if((root==null && head!=null) || (root!=null && head==null)){
            ans = false;
            return ;
        }
        if(root==null || head==null){
            return ;
        }
        if(root.val!=head.val){
            ans = false;
            return;
        }
        inorder(root.left,head.left);
        inorder(root.right,head.right);
    }
}