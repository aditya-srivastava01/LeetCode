class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        while(n>=3){
            if(n%3!=0){
                return false;
            }else{
                n /= 3;
            }
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}