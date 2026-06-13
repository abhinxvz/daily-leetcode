class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int totalsum = 0;
        for(int num : nums)
        {
            totalsum += num;
        }
        if(totalsum % 2 != 0)
        return false;
        int target = totalsum / 2;


         boolean dp[][] = new boolean[n][target+1];
         for(int i = 0; i < n; i++)
         {
            dp[i][0] = true;
         }
         if(nums[0] <= target)
         dp[0][nums[0]] = true;
         for(int ind = 1; ind < n; ind++)
         {
            for(int k = 1; k <= target; k++)
            {
                boolean notTake = dp[ind-1][k];
                boolean take = false;
                if(k >= nums[ind])
                {
                    take = dp[ind-1][k - nums[ind]];
                }
                dp[ind][k] = take || notTake;

            }
         }
         return dp[n-1][target];
        


        
    }
}