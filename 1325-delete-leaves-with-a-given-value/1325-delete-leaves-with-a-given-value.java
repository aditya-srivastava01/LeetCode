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
    int n = 0;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        count(root,target);
        for(int i=0;i<n;i++){
            root = inorder(root,target);
        }
        return root;
        
    }
    public void count(TreeNode root,int target){
        if(root==null){
            return;
        }
        if(root.val==target){
            n++;
        }
        count(root.right,target);
        count(root.left,target);

    }
    public TreeNode inorder(TreeNode root,int x){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null && root.val==x){
            return null;
        }

        root.right = inorder(root.right,x);
        root.left  = inorder(root.left,x);
        return root;
    }
}