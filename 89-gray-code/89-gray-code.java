class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i <(int) Math.pow(2,n); i++){
            ans.add(i ^ i>>1);
        }
        return ans;
    }
}