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
class FindElements {
    TreeNode root;
    Hashtable<Integer,Boolean> map = new Hashtable<>();
    public FindElements(TreeNode root) {
        this.root = root;
        if(root!=null){
            root.val = 0;
        }
        inorder(root);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        map.put(root.val,true);
        if(root.left!=null){
            root.left.val = 2*root.val+1;
        }
        if(root.right!=null){
            root.right.val = 2*root.val+2;
        }
        inorder(root.left);
        inorder(root.right);
    }
    public boolean find(int target) {
        return map.get(target)!=null;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */