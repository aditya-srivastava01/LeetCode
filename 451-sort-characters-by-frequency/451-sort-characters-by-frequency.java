import java.util.*;
class Solution {
    public String frequencySort(String str) {
        char[] s = str.toCharArray();
        int n = s.length;
        Hashtable<Character,Integer> map = new Hashtable<>();
        for(int i=0;i<n;i++){
            map.put(s[i],map.getOrDefault(s[i],0)+1);
        }
        Hashtable<Integer,List<Character>> val = new Hashtable<>();
        for(char c : map.keySet()){
            List<Character> list = new ArrayList<>();
            if(val.get(map.get(c))!=null){
                list = val.get(map.get(c));
                list.add(c);
            }else{
                list.add(c);
            }
            val.put(map.get(c),list);
        }
        String ans = "";
        List<Integer> list = new ArrayList<>(val.keySet());
        Collections.sort(list);
        for(int i = list.size()-1;i>=0;i--){
            int size = list.get(i);
            List<Character> list_char = val.get(size);
            for(char c : list_char){
                char[] arr = new char[size];
                Arrays.fill(arr,c);
                ans += String.valueOf(arr);
            }
        }
        return ans;
    }
}