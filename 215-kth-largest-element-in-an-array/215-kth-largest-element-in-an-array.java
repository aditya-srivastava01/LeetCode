import java.util.*;
class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             pq.add(nums[i]);
//         }
//         // System.out.println(pq);
//         for(int i=0;i<k-1;i++){
//             pq.remove();
//         }
        
        return nums[nums.length-k];
    }
}