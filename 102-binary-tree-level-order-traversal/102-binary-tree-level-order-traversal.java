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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        inorder(root,0);
        // List<List<Integer>> list = new ArrayList<>();
        // for(int i=ans.size()-1;i>=0;i--){
        //     list.add(ans.get(i));
        // }
        return ans;
    }
    public void inorder(TreeNode root,int lvl){
        if(root==null){
            return;
        }      
        if(lvl>=ans.size()){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            ans.add(list);
        }else{
            List<Integer> list = ans.get(lvl);
            list.add(root.val);
            ans.set(lvl,list);
        }
        inorder(root.left,lvl+1);
        inorder(root.right,lvl+1);
    }
}