class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int smallest = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;
        for(int i = 1 ; i < n; i++)
        {
            if(nums[i] < smallest)
            {
                sec_smallest = smallest;
                smallest = nums[i];
            }
            else if (nums[i] < sec_smallest) {
                sec_smallest = nums[i];
            }

            }
            return nums[0] + sec_smallest + smallest;

        }
        
    }