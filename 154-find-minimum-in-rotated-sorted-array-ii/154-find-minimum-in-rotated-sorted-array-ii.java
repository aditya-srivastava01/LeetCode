class Solution {
    public int findMin(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-5000){
                return -5000;
            }
            pq.add(nums[i]);
        }
        return pq.peek();
    }
}