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
    int count = 0;
    public int goodNodes(TreeNode root) {
        inorder(root,root.val);
        return count;
    }
    public void inorder(TreeNode root,int max){
        if(root==null){
            return;
        }
        if(root.val>=max){
            count++;
        }
        inorder(root.left,Math.max(root.val,max));
        inorder(root.right,Math.max(root.val,max));
    }
}