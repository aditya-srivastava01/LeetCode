class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int pos_count[] = new int[10001];
        int neg_count[] = new int[10001];
        
        for(int i=0;i<n;i++){
            if(nums[i]<0 && neg_count[nums[i]*-1]<2){
                neg_count[nums[i]*-1]++;
                pq.add(nums[i]);
            }
            if(nums[i]>=0 && pos_count[nums[i]]<2){
                pos_count[nums[i]]++;
                pq.add(nums[i]);
            }
        }
        int k = 0;
        while(!pq.isEmpty()){
            nums[k] = pq.poll();
            k++;
        }
        return k;
    }
}