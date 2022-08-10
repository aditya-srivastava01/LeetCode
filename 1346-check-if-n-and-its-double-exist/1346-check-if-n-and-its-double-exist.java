class Solution {
    public boolean checkIfExist(int[] arr) {
        int nums[] = new int[2002];
        for(int i:arr){
            nums[i+1000]++;
        }
        for(int i:arr){
            int indx = i*2+1000;
            if(0<=indx && indx<=2001){
                if(nums[i*2+1000]==1 && i!=0){
                    return true;
                }if(i==0 && nums[i*2+1000]>1){
                    return true;
                }                
            }

        }
        return false;
    }
}