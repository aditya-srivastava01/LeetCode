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
    List<List<Integer>> list = new ArrayList<>();
    boolean ans = true;
    public boolean isEvenOddTree(TreeNode root) {
        inorder(root,0);
        // System.out.println(list);
        if(ans==false){
            return false;
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size()-1;j++){
                if(i%2==0){
                    if(list.get(i).get(j)>=list.get(i).get(j+1)){
                        return false;
                    }
                }else{
                    if(list.get(i).get(j)<=list.get(i).get(j+1)){
                        return false;
                    }      
                }
            }
        }
        return ans;
    }
    public void inorder(TreeNode root,int lvl){
        if(!ans){
            return ;
        }
        if(root==null){
            return ;
        }
        if(lvl%2==root.val%2){
            ans = false;
            return ;
        }
        if(lvl>=list.size()){
            List<Integer> ans = new ArrayList<>();
            ans.add(root.val);
            list.add(ans);
        }else{
            List<Integer> ans = list.get(lvl);
            ans.add(root.val);
            list.set(lvl,ans);
        }
        inorder(root.left,lvl+1);
        inorder(root.right,lvl+1);
    }
}