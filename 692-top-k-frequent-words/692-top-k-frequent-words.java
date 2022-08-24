import java.util.*;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>(k);
        int n = words.length;
        Hashtable<String,Integer> map = new Hashtable<>();
        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        Hashtable<Integer,List<String>> val = new Hashtable<>();
        for(String word : map.keySet()){
            List<String> list = new ArrayList();
            if(val.get(map.get(word))!=null){
                list = val.get(map.get(word));
            }
            list.add(word);
            val.put(map.get(word),list);
        }
        System.out.println(val);
        List<Integer> count = new ArrayList<>(val.keySet());
        Collections.sort(count);
        for(int i=count.size()-1;i>=0;i--){
            List<String> list = val.get(count.get(i));
            Collections.sort(list);
            for(String word:list){
                ans.add(word);
                k--;
                if(k==0){
                    break;
                }
            }
            if(k==0){
                break;
            }
        }
        // Collections.sort(ans);
        return ans;
    }
}