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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        inorder(root,sum,0);
        return ans;
    }
    public void inorder(TreeNode root,int sum,int total){
        if(root==null){
            return;
        }
        if((root.left==null && root.right==null) &&(total+root.val==sum)){
            ans = true;
            return;
        }
        total += root.val;
        inorder(root.left,sum,total);
        inorder(root.right,sum,total);
    }
}