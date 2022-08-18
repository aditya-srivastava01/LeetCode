import java.util.*;
class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int ans[] = new int[max+1];
        int res = 0;
        for(int i=0;i<n;i++){
            if(ans[nums[i]]!=-1){
                if(ans[nums[i]]==0){
                    int val = check(nums[i]);
                    if(val!=-1){
                        res += val;
                    }
                    ans[nums[i]] = val;
                }else{
                    res += ans[nums[i]];
                }
            }
            System.out.println(nums[i]+" "+check(nums[i]));
        }
        return res;
    }
    public int check(int n){
        if(n<=4){
            return -1;
        }
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(n);
        for(int i=2;i<=(int)Math.sqrt(n)+1;i++){
            if(n%i==0){
                set.add(i);
                set.add(n/i);
            }
        }
        if(set.size()==4){
            int sum = 0;
            for(int x:set){
                sum += x;
            }
            return sum;
        }
        return -1;
    }
}