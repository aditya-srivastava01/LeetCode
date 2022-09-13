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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {     
        inorder(root,0);
        // for(int i=1;i<ans.size();i+=2){
        //     List<Integer> list = ans.get(i);
        //     List<Integer> val = new ArrayList<>();
        //     for(int j=list.size()-1;j>=0;j--){
        //         val.add(list.get(j));
        //     }
        //     ans.set(i,val);
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
            if(lvl%2==1){
                list.add(0,root.val);
            }
            else{
                list.add(root.val);
            }
            ans.set(lvl,list);
        }
        inorder(root.left,lvl+1);
        inorder(root.right,lvl+1);
    }
}