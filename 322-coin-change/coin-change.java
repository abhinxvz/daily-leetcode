class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1)
        return 0;
        int maxDP[] = new int[amount+1];
        for(int i = 1; i <= amount; i++)
        {
            maxDP[i] = Integer.MAX_VALUE;
            for(int coin : coins)
            {
                if(coin <= i && maxDP[i-coin]!=Integer.MAX_VALUE)
                maxDP[i] = Math.min(maxDP[i], 1+maxDP[i-coin]);
            }}
            if(maxDP[amount]==Integer.MAX_VALUE)
            return -1;
        
        
        return maxDP[amount];
        
    }
}