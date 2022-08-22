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
    int val = 0;
    public int findBottomLeftValue(TreeNode root) {
        inorder(root,1);
        return val;
    }
    public void inorder(TreeNode root,int lvl){
        if(root==null){
            return ;
        }
        if(lvl>depth){
            depth = lvl;
            val = root.val;
        }
        inorder(root.left,lvl+1);
        inorder(root.right,lvl+1);
    }
}