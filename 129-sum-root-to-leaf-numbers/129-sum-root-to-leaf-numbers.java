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
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        inorder(root,0,"");
        return ans;
    }
    public void inorder(TreeNode root,int pow,String sum){
        if(root==null){
            return;
        }
        sum += String.valueOf(root.val); 
        if(root.left==null && root.right==null){
           ans += Integer.valueOf(sum);
        }
        inorder(root.left,pow+1,sum);
        inorder(root.right,pow+1,sum);
    }
}