class Solution {
    public int maxRotateFunction(int[] nums) {
        int ans = 0, f = 0, sum = 0, n = nums.length;
        for(int i = 0; i < n; i++)
        {
            f+=(i*nums[i]);
            sum+= nums[i];
        }
        ans = f;
        for(int i = 1; i < n; i++)
        {
            f+=sum - (n*nums[n-i]);
            ans = Math.max(ans, f);

        }
        return ans;
    }
}