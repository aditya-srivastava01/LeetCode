class Solution {
    int[] nums;
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        this.nums = nums;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                
                int diff = Integer.MAX_VALUE;
                int pos = -1;
                for(int j=i;j<n;j++){
                    if(nums[j]>nums[i-1]){
                        if((nums[j]-nums[i-1])<=diff){
                            diff = nums[j]-nums[i-1];
                            pos = j;
                            // break;
                        }
                    }
                }if(pos!=-1){
                    swap(i-1,pos);
                    int len = n-1;
                    int j = i;
                    while(j<len){
                        swap(j,len);
                        j++;
                        len--;
                    }
                }
                // System.out.println(nums[i-1]+" "+nums[pos]+" "+pos);
                return;
            }
        }
        Arrays.sort(nums);
    }
    public void swap(int i,int j){
        int val = nums[j];
        nums[j] = nums[i];
        nums[i] = val;
    }
}