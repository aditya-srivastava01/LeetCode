class Solution {
    public int minSwaps(String str) {
        int ans = 0;
        char[] s = str.toCharArray();
        int n = s.length;
        int open = 0;
        Stack<Integer> stack = new Stack<>();
        int close = 0;
        for(int i=0;i<n;i++){
            if(s[i]=='['){
                stack.push(i);
                // open++;
            }
            else if(stack.isEmpty()){
                ans++;
            }else{
                stack.pop();        
            }
        }
        ans++;
        return ans/2;
    }
}