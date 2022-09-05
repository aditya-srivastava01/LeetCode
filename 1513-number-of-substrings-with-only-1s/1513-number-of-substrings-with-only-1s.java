import java.util.*;
class Solution {
    Hashtable<String,Long> map = new Hashtable<>();
    public int numSub(String str) {
        // System.out.println(s.substring(0,2));
        String[] s = str.split("0");
        long ans = 0;
        for(int i=0;i<s.length;i++){
            // System.out.println(s[i]);
            if(map.get(s[i])==null){
                long cnt = ((long)s[i].length()*((long)s[i].length()+1l))/2l;
                map.put(s[i],cnt);
                ans += cnt;
            }else{
                ans += map.get(s[i]);
            }
            
        }
        
        return (int)(ans%1000000007l);
    }
}