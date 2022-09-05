import java.util.*;
class Solution {
    Hashtable<String,Integer> map = new Hashtable<>();
    public int numSub(String str) {
        // System.out.println(s.substring(0,2));
        String[] s = str.split("0");
        long ans = 0;
        for(int i=0;i<s.length;i++){
            // System.out.println(s[i]);
            ans += ((long)s[i].length()*((long)s[i].length()+1l))/2l;
        }
        
        return (int)(ans%1000000007l);
    }
    
    public int cnt(String txt,String pat,int n,int k){
        int count =0;
        for(int i=0;i<=n-k;i++){
            if(txt.substring(i,i+k).equals(pat)){
                count++;
            }
        }
        // map.put(txt,map.getOrDefault(txt,0)+count);
        return count;
    }
}