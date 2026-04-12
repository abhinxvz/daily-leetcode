class Solution {
    public int findGCD(int[] nums) {
        int mini = nums[0] , maxi = nums[0];
        int n = nums.length;
        for(int i = 1; i < n; i++)
        {
            mini = Math.min(mini,nums[i]);
            maxi = Math.max(maxi,nums[i]);

        }
        while(maxi!=0)
        {
            int remainder = mini % maxi;
           mini = maxi;
           maxi = remainder;
        }
        return mini;
    }
}