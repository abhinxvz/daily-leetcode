class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        int n = nums.length;
        for(int i = 0 ; i < k ; i++)
        {
            sum += nums[i];
        }
        double max_sub = sum;
        for(int i = k ; i < n ; i++)
        {
            sum += nums[i] - nums[i-k];
            if(sum > max_sub)
            max_sub = sum;
        }
        return max_sub / k;

    }
}