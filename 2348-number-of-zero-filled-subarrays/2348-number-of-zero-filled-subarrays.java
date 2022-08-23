class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int i = 0;
        int j = 0;
        int n = nums.length;
        long count[] = new long[1000001];
        for(i=0;i<n;i+=0){
            if(nums[i]==0){
                for(j=i;j<n;j++){
                    if(nums[j]!=0){
                        break;
                    }
                }
                long size = j-i;
                if(count[(int)size]!=0){
                    ans += count[(int)size];
                }else{
                    long val = size*(size+1)+(size+1)-((size+1)*(size+2))/2;
                    ans += val;
                    count[(int)size] = val;
                }

                i += size;
            }else{
                i++;
            }
        }
        return ans;
    }
}