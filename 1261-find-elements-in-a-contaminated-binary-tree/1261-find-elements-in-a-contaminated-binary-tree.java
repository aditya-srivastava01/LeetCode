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
        inorder(root,0);
        // System.out.println(map);
    }
    public void inorder(TreeNode root,int val){
        if(root==null){
            return;
        }
        map.put(val,true);
        inorder(root.left,val*2+1);
        inorder(root.right,val*2+2);
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