import java.util.*;
class Solution {
    Hashtable<String,Integer> map = new Hashtable<>();
    public List<Integer> findSubstring(String str, String[] words) {
        List<Integer> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder(str);
        int len = words.length*words[0].length();
        int n = s.length();
        if(len>n){
            return ans;
        }
        int k = 0;
        String slide = str.substring(k,len);
        for(String word:words){
            map.putIfAbsent(word,0);
            map.put(word,map.get(word)+1);
        }
        if(check(slide,words[0].length())){
            ans.add(0);
        }
        for(int i=len;i<n;i++){
            k++;
            slide = str.substring(k,len+k);
            if(check(slide,words[0].length())){
                ans.add(i-len+1);
            }
        }
        return ans;
    }
    public boolean check(String word,int len){
        String[] chunks = word.split("(?<=\\G.{" + len + "})");
        Hashtable<String,Integer> count = new Hashtable<>();
        for(String s : chunks){
            count.putIfAbsent(s,0);
            count.put(s,count.get(s)+1);
            if(map.get(s)==null){
                return false;
            }
            if(count.get(s)>map.get(s)){
                return false;
            }
        }
        for(String s: chunks){
            if(!map.get(s).equals(count.get(s))){
                return false;
            }
        }
        return true;
    }
}