import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        int ans = 1000000;
        Hashtable<Character,Integer> map =  new Hashtable<>();
        Hashtable<Character,Integer> index =  new Hashtable<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            index.putIfAbsent(s.charAt(i),i);
        }
        // System.out.println(map);
        for(char c : map.keySet()){
            if(map.get(c)==1){
                ans = Math.min(index.get(c),ans);
            }
        }
        if(ans==1000000){
            ans = -1;
        }
        return ans;
    }
}