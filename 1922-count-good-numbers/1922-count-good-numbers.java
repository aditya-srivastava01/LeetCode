class Solution {
    long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long five = (n%2l==1)?n/2+1:n/2;
        long four = n/2;
        return (int)(pow((long)5,five)%1000000007*pow((long)4,four)%1000000007);
    }
    public long pow(long x, long y){
        long res = 1;
        while (y > 0){
            if ((y & 1) == 1){
                res = (res * x) % 1000000007;
            }            
            x = (x * x) % 1000000007;
            y >>= 1;
        }
        return res;
    }
}
