class MinStack {
    private Stack <int[]> stack;

    public MinStack() {
        stack = new Stack<>();
        
    }
    
    public void push(int value) {
        if(stack.isEmpty())
        {
            stack.push(new int[]{value,value});

        }
        else {
            int minc = Math.min(value, stack.peek()[0]);
            stack.push(new int[]{minc,value});
        }
        
    }
    
    public void pop() {
       stack.pop();
        
    }
    
    public int top() {
        return stack.peek()[1];
        
    }
    
    public int getMin() {
        return stack.peek()[0];
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */