class NumArray {
    int[] arr;
    int total = 0;
    int n = 0;
    public NumArray(int[] nums) {
        arr = nums;
        n = nums.length;
        for(int i=0;i<nums.length;i++){
            total += arr[i];
        }
    }
    
    public void update(int index, int val) {
        total -= arr[index];
        total += val;
        arr[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int in = right-left+1;
        int out = left-1+n-right+1;
        if(in<out){
            int sum = 0;
            while(left<=right){
                sum += arr[left];
                left++;
            }
            return sum;
        }
        int sum = total;
        for(int i=0;i<left;i++){
            sum -= arr[i];
        }for(int i=right+1;i<n;i++){
            sum -= arr[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */