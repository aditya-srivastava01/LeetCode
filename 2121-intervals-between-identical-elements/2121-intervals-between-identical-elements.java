class Solution {
    long[] ans;
    List<Integer> list;
    HashMap<Integer,Long> indx_sum = new HashMap<>();
    public long[] getDistances(int[] arr) {
        int n = arr.length;
        this.ans = new long[n];
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
           if(map.get(arr[i])==null){
               list = new ArrayList<>();
               list.add(i);
               map.put(arr[i],list);
           }else{
               list = map.get(arr[i]);
               list.add(i);
               map.put(arr[i],list);
           }
            indx_sum.put(arr[i],indx_sum.getOrDefault(arr[i],0l)+i);
        }
        // System.out.println(map);
        // System.out.println(indx_sum);
        for(int i: map.keySet()){
            solve(i,map.get(i));
        }
        // solve(3,map.get(3));
        return ans;
    }
    public void solve(int x,List<Integer> list){
        long sum = indx_sum.get(x);
        long pre = 0l;
        int n = list.size();
        for(int i=0;i<n;i++){
            ans[list.get(i)] = (long)sum-((long)list.get(i)*((long)(n-i)))+Math.abs(pre-(long)((long)list.get(i)*(long)i));
            pre += (long)list.get(i);
            sum -= (long)list.get(i);
            // System.out.println(sum+" "+pre);
        }
    }
}