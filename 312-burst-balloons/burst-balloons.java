class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int newnums[] = new int[n+2];
        newnums[0] = 1;
        newnums[n+1] = 1;
        for(int i = 0; i < n; i++)
        {
            newnums[i+1] = nums[i];

        }
        int dp[][] = new int[n+2][n+2];
        for(int length = 2 ; length < n + 2; length++)
        {
        for(int i = 0; i + length < n + 2; i++)
        {
          int j = i + length;
        for(int k = i + 1; k < j; k++)
        {
            int coins = newnums[i] * newnums[k] * newnums[j] + dp[i][k] + dp[k][j];
        
            dp[i][j] = Math.max(dp[i][j], coins);
}}}
return dp[0][n+1];
    }}