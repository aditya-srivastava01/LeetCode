class Solution {
    public int maxProfitAssignment(int[] diff, int[] profit, int[] worker) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        int n = diff.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            pq.add(new int[] {profit[i],diff[i]});
        }
        n = worker.length;
        PriorityQueue<Integer> work = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=n-1;i>=0;i--){
            work.add(worker[i]);
        }
        while(!work.isEmpty() && !pq.isEmpty()){
            if(work.peek()>=pq.peek()[1]){
                ans += pq.peek()[0];
                work.poll();
            }else{
                pq.poll();
            }
        }
        return ans;
    }
}