import java.util.*;
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Hashtable<Integer,Integer> map = new Hashtable<>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(arr[i],0);
            map.put(arr[i],map.get(arr[i])+1); 
        }
        int[] ans = new int[map.size()];
        int j = 0;
        for(int i : map.keySet()){
           ans[j] = map.get(i);
           j++;
        } 
        Arrays.sort(ans);
        
        for(int i = 0;i<ans.length;i++){
            if(ans[i]>0){
                if(k>=ans[i]){
                    k -= ans[i];
                    ans[i] = 0;
                }
                if(k==0){
                    break;
                }
            }
        }

        int res = 0;
        for(int i:ans){
            if(i>0){
                res++;
            }
        }
        return res; 
    }
}