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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // List<Integer> x = new ArrayList<>();
        inorder(root,"",0,targetSum);
        return ans;
    }
    public void inorder(TreeNode root,String list,int sum,int x){
        if(root==null){
            return ;
        }
        sum += root.val;
        list += String.valueOf(root.val)+".";
        if(root.left==null && root.right==null && sum==x){
            List<Integer> path = new ArrayList<>();
            String[] s = list.split("\\.");
            for(int i=0;i<s.length;i++){
                path.add(Integer.valueOf(s[i]));
            }
            ans.add(path);
        }
        inorder(root.left,list,sum,x);
        inorder(root.right,list,sum,x);
    }
}