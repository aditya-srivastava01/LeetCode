class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]-b[1]==0)?a[0]-b[0]:a[1]-b[1]);
        for(int i=0;i<arr.length;i++){
            pq.add(new int[] {arr[i],Math.abs(arr[i]-x)});
        }
        List<Integer> ans = new ArrayList<>();
        while(k-->0){
            ans.add(pq.poll()[0]);
        }
        Collections.sort(ans);
        return ans;
    }
}