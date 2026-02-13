class Solution {
    public long subArrayRanges(int[] nums) {
        long res = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int maxi = Integer.MIN_VALUE;
            int mini = Integer.MAX_VALUE;
            for(int j = i; j < n; j++)
            {
                maxi = Math.max(maxi,nums[j]);
                mini = Math.min(mini,nums[j]);
                res+= maxi - mini;
            }
        }
        return res;
    }
}