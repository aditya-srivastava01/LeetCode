import java.util.*;
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Hashtable<Integer,Hashtable<Integer,PriorityQueue<Integer>>> map = new Hashtable<>();
    PriorityQueue<Integer> col = new PriorityQueue<>();
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        inorder(root,0,0);
        while(!col.isEmpty()){
            int i = col.poll();
            List<Integer> temp = new ArrayList<>();
            Hashtable<Integer,PriorityQueue<Integer>> mp = map.get(i);
            Enumeration<Integer> keys = mp.keys();
            List<Integer> list = Collections.list(keys);
            Collections.sort(list);
            for(int x:list){
                PriorityQueue<Integer> pq =mp.get(x);
                while(!pq.isEmpty()){
                    temp.add(pq.poll());
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
            Hashtable<Integer,PriorityQueue<Integer>> mp = map.get(x);
            if(mp.get(y)!=null){
                PriorityQueue<Integer> list = mp.get(y);
                list.add(root.val);
                mp.put(y,list);
                map.put(x,mp);
            }else{
                PriorityQueue<Integer> list = new PriorityQueue<>();
                list.add(root.val);
                mp.put(y,list);
                map.put(x,mp);               
            } 
        }
        else{
            Hashtable<Integer,PriorityQueue<Integer>> mp = new Hashtable<>();
            PriorityQueue<Integer> list = new PriorityQueue<>();
            list.add(root.val);
            mp.put(y,list);
            map.put(x,mp);               
        }
        if(!col.contains(x)){
            col.add(x);
        }
        // System.out.println(root.val+" "+y+" "+x);
        inorder(root.left,x-1,y+1);
        inorder(root.right,x+1,y+1);
    }
}