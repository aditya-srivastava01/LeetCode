class Solution {
    public boolean isNStraightHand(int[] nums, int k) {
         int n = nums.length;
        if(k==1){
            return  true;
        }
        if(n%k!=0){
            return false;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
        int prev = pq.poll();
        int len = n/k;
        int size = 0;
        size++;
        // System.out.println(prev+" : "+pq);
        while(pq.size()>0){
            if(pq.contains(prev+1)){
                prev++;
                pq.remove(prev);
                size++;
                // System.out.println(prev+" : "+pq);
            }
            
            else{
                // System.out.println(prev+" : "+pq);
                return false;
            }
            if(size==k && pq.size()>0){
                // System.out.println("---------------------");
                prev = pq.poll();
                size = 1;
                // System.out.println(prev+" : "+pq);
            }
            
        }
        return true;       
    }
}