import java.util.*;
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int i = 0;
        int j = 0;
        int n = nums.length;
        Hashtable<Long,Long> map = new Hashtable<>();
        for(i=0;i<n;i+=0){
            if(nums[i]==0){
                for(j=i;j<n;j++){
                    if(nums[j]!=0){
                        break;
                    }
                }
                long size = j-i;
                if(map.get(size)!=null){
                    ans += map.get(size);
                }else{
                    long sum = ((size+1)*(size+2))/2;
                    long val = size*(size+1)+(size+1)-sum;
                    ans += size*(size+1)+(size+1)-sum;
                    map.put(size,val);
                }
                // long sum = ((size+1)*(size+2))/2;
                // ans += size*(size+1)+(size+1)-sum;
                i += size;
            }else{
                i++;
            }
        }
        return ans;
    }
}