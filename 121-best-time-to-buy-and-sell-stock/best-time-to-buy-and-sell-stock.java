class Solution {
    public int maxProfit(int[] prices) {
       int mini = prices[0];
       int maxp = 0;
       int n = prices.length;
       for(int i = 0; i < n; i++)
       {
        int cost = prices[i] - mini;
        maxp = Math.max(maxp,cost);
        mini = Math.min(mini,prices[i]);
       }
       return maxp;
    }}