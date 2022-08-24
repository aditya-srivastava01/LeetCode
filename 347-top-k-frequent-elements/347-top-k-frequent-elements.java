import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        Hashtable<Integer,Integer> map = new Hashtable<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(b[0]-a[0]));
        for (int i : map.keySet()){
            pq.add(new int[]{map.get(i), i});
        }
        for (int i = 0; i < k; i++){
            ans[i] = pq.poll()[1];
        }
        return ans;
    }
}