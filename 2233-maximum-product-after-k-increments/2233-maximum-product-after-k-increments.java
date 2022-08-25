import java.util.*;
class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public int maximumProduct(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }while(k>0){
            pq.add(pq.poll()+1);
            k--;
        }
        long ans = 1;
        int mod = 1000000007;
        while(!pq.isEmpty()){
            ans *= pq.poll();
            ans %= mod;
        }
        return (int)ans;
    }
}