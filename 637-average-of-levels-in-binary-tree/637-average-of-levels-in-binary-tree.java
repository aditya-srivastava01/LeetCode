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
    List<Double> node_sum = new ArrayList<>();
    List<Double> lvl_sum = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        inorder(root,0);
        for(int i=0;i<lvl_sum.size();i++){
            lvl_sum.set(i,node_sum.get(i)/lvl_sum.get(i));
        }
        return lvl_sum;
        
    }
    public void inorder(TreeNode root,int lvl){
        if(root==null){
            return;
        }
        if(lvl_sum.size()>lvl){
            node_sum.set(lvl,node_sum.get(lvl)+(double)root.val);
            lvl_sum.set(lvl,lvl_sum.get(lvl)+1d);
        }else{
            node_sum.add((double)root.val);
            lvl_sum.add(1d);
        }
        inorder(root.left,lvl+1);
        inorder(root.right,lvl+1);
    }
}