class CustomStack {
    List<Integer> stack = new ArrayList<>();
    int max = 0;
    public CustomStack(int maxSize) {
        max = maxSize;
    }
    
    public void push(int x) {
        if(stack.size()<max){
            stack.add(x);
        }
    }
    
    public int pop() {
        if(stack.size()==0){
            return -1;
        }else{
            int x = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return x;
        }
    }
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(stack.size(),k);i++){
            stack.set(i,stack.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */