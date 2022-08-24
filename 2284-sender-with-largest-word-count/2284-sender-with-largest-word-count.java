import java.util.*;
class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        int n = senders.length;
        int max = 0;
        Hashtable<String,Integer> map = new Hashtable<>();
        for(int i=0;i<n;i++){
            String[] s = messages[i].split(" ");
            int size = s.length;
            map.put(senders[i],map.getOrDefault(senders[i],0)+size);
            max = Math.max(max,map.get(senders[i]));
        }
        System.out.println(map);
        PriorityQueue<String> ans = new PriorityQueue<>(Collections.reverseOrder());
        for(String word : map.keySet()){
            if(map.get(word)==max){
                ans.add(word);
            }
        }
        return ans.peek();
    }
    public int hash(String word){
        int p = 0;
        for (int i=0;i<word.length();i++){
            p = (128*p + word.charAt(i))%83;
        }
        return p;
    }
}