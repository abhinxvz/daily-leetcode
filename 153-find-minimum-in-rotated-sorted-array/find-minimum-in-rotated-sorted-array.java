class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int mini = nums[0];
        for(int num : nums)
        {
            mini = Math.min(mini,num);
        }
        return mini;
    }
}