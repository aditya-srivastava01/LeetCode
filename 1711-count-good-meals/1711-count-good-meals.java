class Solution {
    public int countPairs(int[] d) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] two = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152};
        int n = d.length;
        List<Integer> list;
        long ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<22;j++){
                if(map.get(two[j]-d[i])!=null){
                    ans += map.get(two[j]-d[i]);
                }
            }
            map.put(d[i],map.getOrDefault(d[i],0)+1);
        }
        
        int res = (int)(ans%1_000_000_007);
        return res;
    }
}