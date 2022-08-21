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
import java.util.*;
class Solution {
    Hashtable<Integer,Integer> map = new Hashtable<>();
    int max = 1;
    public int deepestLeavesSum(TreeNode root) {
        inorder(root,1);
        return map.get(max);
    }
    public void inorder(TreeNode root,int lvl){
        if(root==null){
            return;
        }
        max = Math.max(max,lvl);
        map.put(lvl,map.getOrDefault(lvl,0)+root.val);
        inorder(root.left,lvl+1);
        inorder(root.right,lvl+1);
    }
}