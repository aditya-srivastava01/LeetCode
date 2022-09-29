class Solution {
    long[] ans;
    List<Long> list;
    // HashMap<Integer,Long> indx_sum = new HashMap<>();
    long[] indx_sum = new long[1_0_0_0_0_1];
    public long[] getDistances(int[] arr) {
        int n = arr.length;
        this.ans = new long[n];
        HashMap<Integer,List<Long>> map = new HashMap<>();
        for(int i=0;i<n;i++){
           if(map.get(arr[i])==null){
               list = new ArrayList<>();
               list.add((long)i);
               map.put(arr[i],list);
           }else{
               list = map.get(arr[i]);
               list.add((long)i);
               map.put(arr[i],list);
           }
            indx_sum[arr[i]] += i;
            // indx_sum.put(arr[i],indx_sum.getOrDefault(arr[i],0l)+i);
        }
        // System.out.println(map);
        // System.out.println(indx_sum);
        for(int i: map.keySet()){
            solve(i,map.get(i));
        }
        // solve(3,map.get(3));
        return ans;
    }
    public void solve(int x,List<Long> list){
        long sum = indx_sum[x];
        long pre = 0l;
        int n = list.size();
        for(int i=0;i<n;i++){
            int indx = list.get(i).intValue();
            ans[indx] = sum-(list.get(i)*((long)(n-i)))+Math.abs(pre-(long)(list.get(i)*(long)i));
            pre += list.get(i);
            sum -= list.get(i);
            // System.out.println(sum+" "+pre);
        }
    }
}