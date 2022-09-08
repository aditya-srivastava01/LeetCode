class Solution {
    public int minCost(int[] start, int[] home, int[] row, int[] col) {
        int ans = 0;
        for(int i=Math.min(start[0],home[0]);i<=Math.max(start[0],home[0]);i++){
            ans += row[i];
        }
        for(int i=Math.min(start[1],home[1]);i<=Math.max(start[1],home[1]);i++){
            ans += col[i];
        }
        return ans-row[start[0]]-col[start[1]];
    }
}