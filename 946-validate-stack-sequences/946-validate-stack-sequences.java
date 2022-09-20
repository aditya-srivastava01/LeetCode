class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int n = pushed.length;
        int i = 0;
        int j = 0;
        while(pushed[i]!=popped[0]){
            stack.push(pushed[i]);
            i++;
        }
        while(i<n && j<n){
            while(!stack.isEmpty() && stack.peek()==popped[j]){
               stack.pop();
                ++j;
            }
            stack.push(pushed[i]);
            i++;
        }
        while(!stack.isEmpty() && stack.peek()==popped[j]){
            stack.pop();
            j++;
        }
        return stack.isEmpty();
    }
}