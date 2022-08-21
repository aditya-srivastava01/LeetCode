import java.util.*;
class Solution {
    public int[] singleNumber(int[] arr) {
        int n = arr.length;
        int ans[] = new int[2];
        Hashtable<Integer,Integer> map = new Hashtable<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            set.add(arr[i]);
        }
        int k = 0;
        for(int i:set){
            if(map.get(i)==1){
                ans[k] = i;
                k++;
            }
        }
        return ans;
    }
}