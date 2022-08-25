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
    List<Integer> ans = new ArrayList<>(); 
    public List<Integer> largestValues(TreeNode root) {
        inorder(root,0);
        return ans;
    }
    public void inorder(TreeNode root,int lvl){
        if(root==null){
            return;
        }
        if(lvl>=ans.size()){
            ans.add(root.val);
        }else{
            ans.set(lvl,Math.max(ans.get(lvl),root.val));
        }
        inorder(root.left,lvl+1);
        inorder(root.right,lvl+1);
    }
}