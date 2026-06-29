class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int result[] = new int [n];
        for(int idx = n - 1; idx >= 0; idx--)
        {

        while(!st.isEmpty() && temperatures[idx] >= temperatures[st.peek()])
        {
            st.pop();
        }
        if(!st.isEmpty())
        {
            result[idx] = st.peek() - idx;
        }
        st.push(idx);
    }
    return result;
}
}