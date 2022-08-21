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
    int[] count = new int[1001];
    int max = 1;
    public int deepestLeavesSum(TreeNode root) {
        inorder(root,1);
        return count[max];
    }
    public void inorder(TreeNode root,int lvl){
        if(root==null){
            return;
        }
        max = Math.max(max,lvl);
        count[lvl] += root.val;
        inorder(root.left,lvl+1);
        inorder(root.right,lvl+1);
    }
}