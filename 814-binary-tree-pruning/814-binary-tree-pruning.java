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
    public TreeNode pruneTree(TreeNode root) {
        return inorder(root);
    }
    public TreeNode inorder(TreeNode root){
        if(root==null){
            return null;
        }
        root.left = inorder(root.left);
        root.right = inorder(root.right);            
      
        if(root.left==null && root.right==null && root.val==0){
            root = null;
            // return;
        }

        return root;
    }
}