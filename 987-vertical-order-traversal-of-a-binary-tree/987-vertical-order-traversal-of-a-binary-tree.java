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
    List<List<Integer>> ans = new ArrayList<>();
    Hashtable<Integer,Hashtable<Integer,List<Integer>>> map = new Hashtable<>();
    List<Integer> col = new ArrayList<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        inorder(root,0,0);
        Collections.sort(col);
        for(int i:col){
            List<Integer> temp = new ArrayList<>();
            Hashtable<Integer,List<Integer>> mp = map.get(i);
            Enumeration<Integer> keys = mp.keys();
            List<Integer> list = Collections.list(keys);
            Collections.sort(list);
            for(int x:list){
                List<Integer> lis =mp.get(x);
                Collections.sort(lis);
                for(int y:lis){
                    temp.add(y);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    
    public void inorder(TreeNode root,int x,int y){
        if(root==null){
            return;
        }
        
        if(map.get(x)!=null){
            Hashtable<Integer,List<Integer>> mp = map.get(x);
            if(mp.get(y)!=null){
                List<Integer> list = mp.get(y);
                list.add(root.val);
                mp.put(y,list);
                map.put(x,mp);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(root.val);
                mp.put(y,list);
                map.put(x,mp);               
            }
            
        }
        else{
            Hashtable<Integer,List<Integer>> mp = new Hashtable<>();
            if(mp.get(y)!=null){
                List<Integer> list = mp.get(y);
                list.add(root.val);
                mp.put(y,list);
                map.put(x,mp);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(root.val);
                mp.put(y,list);
                map.put(x,mp);               
            }
            
        }
        if(!col.contains(x)){
            col.add(x);
        }
        // System.out.println(root.val+" "+y+" "+x);
        inorder(root.left,x-1,y+1);
        inorder(root.right,x+1,y+1);
    }
}