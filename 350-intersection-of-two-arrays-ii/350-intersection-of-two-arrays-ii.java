class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int[] one = new int[1001];
        int[] two = new int[1001];
        for(int i:nums1){
            one[i]++;
        }for(int i:nums2){
            two[i]++;
        }
        for(int i=0;i<1001;i++){
            if((one[i]>1 || two[i]>1) || (one[i]==1 && two[i]==1)){
                for(int j=0;j<Math.min(one[i],two[i]);j++){
                    ans.add(i);
                }
            }
        }
        int n = ans.size();
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}

