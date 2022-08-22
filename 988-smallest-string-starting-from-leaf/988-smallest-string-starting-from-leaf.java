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
    char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    PriorityQueue<String> pq = new PriorityQueue<>();
    public String smallestFromLeaf(TreeNode root) {
        inorder(root,"");
        return pq.peek();
    }
    public void inorder(TreeNode root,String val){
        if(root==null){
            return;
        }
        val += alpha[root.val];
        if(root.left==null && root.right==null){
            char[] arr = val.toCharArray();
            int n = arr.length;
            for(int i=0;i<n/2;i++){
                char c = arr[i];
                arr[i] = arr[n-i-1];
                arr[n-i-1] = c;
            }
            val = String.valueOf(arr);
            pq.add(val);
            return ;
        }
        inorder(root.left,val);
        inorder(root.right,val);
    }
}