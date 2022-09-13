import java.util.*;
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> list = new ArrayList<>();
        Hashtable<String,Integer> map = new Hashtable<>();
        for(int i=1;i<=n;i++){
            String val = String.valueOf(i);
            map.put(val,i);
            list.add(val);
        }
        Collections.sort(list);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(map.get(list.get(i)));
        }
        return ans;
    }
}