import java.util.*;
class Solution {
    public String mostCommonWord(String str, String[] banned) {
        str = str.replace("!"," ");
        str = str.replace("?"," ");
        str = str.replace("'"," ");
        str = str.replace(","," ");
        str = str.replace(";"," ");
        str = str.replace("."," ");
        str = str.toLowerCase();
        String[] s = str.split(" ");
        Hashtable<String,Integer> map = new Hashtable<>();
        for(int i=0;i<s.length;i++){
            map.put(s[i],map.getOrDefault(s[i],0)+1);
        }
        for(String word : banned){
            map.remove(word);
        }
        String ans = "";
        int count = 0;
        for(String word : map.keySet()){
            if(word.length()>0 && map.get(word)>count){
                count = map.get(word);
                ans = word;
                // System.out.println(word+" : "+map.get(word));
            }
        }
        // System.out.println(map);
        return ans;
    }
}