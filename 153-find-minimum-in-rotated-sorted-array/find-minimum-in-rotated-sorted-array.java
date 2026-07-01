class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mini = Integer.MAX_VALUE;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(nums[left] <= nums[mid])
            {
                mini = Math.min(mini,nums[left]);
                left = mid + 1;

            }
            else {
                right = mid - 1;
                mini = Math.min(mini, nums[mid]);
            }
        }
        return mini;
            }
}