class Solution {
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;

        int newcuts[] = new int[m+2];
        newcuts[0] = 0;
        newcuts[m+1] = n;
        for(int i = 0; i < m; i++)
        {
            newcuts[i+1] = cuts[i];

        }
        Arrays.sort(newcuts);
        int dp[][] = new int[m+2][m+2];
        for(int length = 2; length < m+2 ; length++)
        {
            for(int i = 0; i + length < m + 2; i++)
            {
                int j = i + length;
                dp[i][j] = Integer.MAX_VALUE;
               for(int k = i + 1; k < j; k++)
               {
                int cost = newcuts[j] - newcuts[i] + dp[i][k] + dp[k][j];
                dp[i][j] = Math.min(dp[i][j], cost);


               }
               if(dp[i][j] == Integer.MAX_VALUE)
               {
                dp[i][j] = 0;
               }
            }
        }
        
        return dp[0][m + 1];



        
    }
}