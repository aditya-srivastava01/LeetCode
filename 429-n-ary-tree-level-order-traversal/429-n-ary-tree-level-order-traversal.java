/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null){
            return ans;
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        ans.add(list);
        inorder(root,1);
        // System.out.println(root.children.val);
        return ans;
    }
    public void inorder(Node root,int lvl){
        if(root.children.size()==0){
            return;
        }
        if(lvl>=ans.size()){
            List<Integer> list = new ArrayList<>();
            for(Node n : root.children){
                list.add(n.val);
            }
            ans.add(list);
            for(Node n :root.children){
                inorder(n,lvl+1);
            }           
        }
        else{
            List<Integer> list = ans.get(lvl);
            for(Node n : root.children){
                list.add(n.val);
            }
            ans.set(lvl,list); 
            for(Node n :root.children){
                inorder(n,lvl+1);
            }
        }
    }
}