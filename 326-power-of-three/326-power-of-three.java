class Solution {
    public boolean isPowerOfThree(int n) {
        char num[] = Integer.toString(n,3).toCharArray();
        if(num[0]!='1'){
            return false;
        }
        System.out.println(Integer.toString(n,3));
        for(int i=1;i<num.length;i++){
            if(num[i]!='0'){
                return false;
            }
        }
        return true;
    }
}