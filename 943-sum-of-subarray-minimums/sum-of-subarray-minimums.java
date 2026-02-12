class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        // Previous Smaller
        for (int i = 0; i < n; i++) {
            while (!stack1.isEmpty() && arr[stack1.peek()] > arr[i]) {
                stack1.pop();
            }
            left[i] = stack1.isEmpty() ? (i + 1) : (i - stack1.peek());
            stack1.push(i);
        }
        
        // Next Smaller
        for (int i = n - 1; i >= 0; i--) {
            while (!stack2.isEmpty() && arr[stack2.peek()] >= arr[i]) {
                stack2.pop();
            }
            right[i] = stack2.isEmpty() ? (n - i) : (stack2.peek() - i);
            stack2.push(i);
        }
        
        long sum = 0;
        int mod = 1000000007;
        
        for (int i = 0; i < n; i++) {
            sum = (sum + (long) arr[i] * left[i] * right[i]) % mod;
        }
        
        return (int) sum;
    }
}
