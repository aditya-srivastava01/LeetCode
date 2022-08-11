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
    boolean ans=true;
    public boolean isValidBST(TreeNode root) {
        return solve(root,null,null);
    }
    public boolean solve(TreeNode root,Integer left,Integer right){
        if(root==null){
            return true ;
        }
        if(left!=null){
            if(root.val<=left){
                return false;
            }
        }if(right!=null){
            if(root.val>=right){
                return false;
            }
        }
        return solve(root.right,root.val,right) && solve(root.left,left,root.val);
    }
}