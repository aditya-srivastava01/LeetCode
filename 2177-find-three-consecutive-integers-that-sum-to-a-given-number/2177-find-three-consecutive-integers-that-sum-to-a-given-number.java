class Solution {
    public long[] sumOfThree(long num) {
        if(num%3l!=0){
            return new long[0];
        }
        long n = num/3l-1;
        long ans[] = {n,n+1l,n+2l};
        return ans;
    }
}