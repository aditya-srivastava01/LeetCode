class Solution {
    public long[] sumOfThree(long num) {
        if(num%3l!=0){
            return new long[0];
        }
        return new long[] {num/3l-1l, num/3l,num/3l+1l};
    }
}