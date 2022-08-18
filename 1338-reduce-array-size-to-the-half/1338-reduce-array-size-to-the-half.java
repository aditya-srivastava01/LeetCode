import java.util.*;
class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int req = n/2;
        int ans = 0;
        Hashtable<Integer,Integer> map = new Hashtable<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int k = map.size();
        int[] count = new int[k];
        k--;
        for(int i :map.keySet()){
            count[k] = map.get(i);
            k--;
        }
        Arrays.sort(count);
        k = count.length;
        k--;
        while(n>req){
            n -= count[k];
            ans++;
            k--;
        }
        return ans;
    }
}