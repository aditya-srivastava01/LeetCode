import java.util.*;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Hashtable<String,Integer> map = new Hashtable<>();
        List<String> ans = new ArrayList<>();
        for(String domain  : cpdomains){
            String[] sub = domain.split(" ");
            int count = Integer.valueOf(sub[0]);
            String[] sites = sub[1].split("\\.");
            if(sites.length==3){
                sites[0] += "."+sites[1]+"."+sites[2];
                sites[1] += "."+sites[2];
            }
            if(sites.length==2){
                sites[0] += "."+sites[1];
            }
            for(String s : sites){
                // System.out.print(s+" ");
                String all[];
                if(map.get(s)==null){
                    map.put(s,count);
                }else{
                    map.put(s,map.get(s)+count);
                }
            }
            // System.out.println();
        }
        // System.out.println(map);
        for(String key : map.keySet()){
            ans.add(String.valueOf(map.get(key))+" "+key);
        }
        return ans;
    }
}