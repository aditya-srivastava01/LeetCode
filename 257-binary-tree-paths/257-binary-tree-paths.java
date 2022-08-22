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
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        inorder(root,"");
        return ans;
    }
    public void inorder(TreeNode root,String path){
        if(root==null){
            return ;
        }
        path += String.valueOf(root.val);
        if(root.left==null && root.right==null){
            ans.add(path);
            return;
        }
        path += "->";
        inorder(root.left,path);
        inorder(root.right,path);
    }
}