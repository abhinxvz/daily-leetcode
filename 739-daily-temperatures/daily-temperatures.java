class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
         int[] answer = new int[n];
        for(int i = 0; i < n; i++)
        {
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()])
            {
                int prevind = st.pop();
                answer[prevind] = i - prevind;

            }
            st.push(i);
        }
        return answer;
    }
}