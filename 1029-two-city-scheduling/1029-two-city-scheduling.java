class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        int ans = 0;
        for(i=0;i<n;i++){
            ans += costs[i][0];
            pq.add(costs[i][1]-costs[i][0]);
        }
        while(i-->n/2){
            ans += pq.poll();
        }
        return ans;
    }
    // public void solve(int[][] costs,int i,int sum,int a,int b){
    //     if(i==n && a==b && a==n/2){
    //         ans = Math.min(ans,sum);
    //         return;
    //     }
    //     if(i==n || sum>ans || a>b+(n-a-b) || b>a+(n-b-a)){
    //         return;
    //     }
    //     solve(costs,i+1,sum+costs[i][0],a+1,b);
    //     solve(costs,i+1,sum+costs[i][1],a,b+1);
    // }
}