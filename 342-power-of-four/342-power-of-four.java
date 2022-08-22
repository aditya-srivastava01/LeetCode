class Solution {
    public boolean isPowerOfFour(int n) {
        int[] four  = {1,4,16,64,256,1024,4096,16384,65536,262144,1048576,4194304,16777216,67108864,268435456,1073741824};
        return search(four,0,four.length-1,n);
    }
    public boolean search(int[] four,int l ,int r,int x){
        if(r>=l){
            int mid = l+(r-l)/2;
            if(four[mid]==x){
                return true;
            }
            if(four[mid]>x){
                return search(four,l,mid-1,x);
            }
            return search(four,mid+1,r,x);
        }
        return false;
    }
}
