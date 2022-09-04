class Solution {
    public int[] closestDivisors(int num) {
        int ans[] = new int[2];
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=(int)Math.sqrt(num+2)+1;i++){
            if((num+1)%i==0){
                int val = Math.abs(i-(num+1)/i);
                if(val<min){
                    min = val;
                    ans[0] = i;
                    ans[1] = (num+1)/i;
                }
            }
            if((num+2)%i==0){
                int val = Math.abs(i-(num+2)/i);
                if(val<min){
                    min = val;
                    ans[0] = i;
                    ans[1] = (num+2)/i;
                }
            }
            if(min==0){
                return ans;
            }
        }
        return ans;
    }
}