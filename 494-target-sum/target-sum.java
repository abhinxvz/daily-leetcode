class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum + target < 0 || (totalSum + target) % 2 != 0) {
            return 0;
        }

        int subsetSum = (totalSum + target) / 2;
        int n = nums.length;

        int[][] dp = new int[n][subsetSum + 1];

        if (nums[0] == 0) {
            dp[0][0] = 2;
        } else {
            dp[0][0] = 1;
        }

        if (nums[0] != 0 && nums[0] <= subsetSum) {
            dp[0][nums[0]] = 1;
        }

        for (int index = 1; index < n; index++) {
            for (int sum = 0; sum <= subsetSum; sum++) {

                int notTake = dp[index - 1][sum];

                int take = 0;
                if (nums[index] <= sum) {
                    take = dp[index - 1][sum - nums[index]];
                }

                dp[index][sum] = take + notTake;
            }
        }

        return dp[n - 1][subsetSum];
    }
}