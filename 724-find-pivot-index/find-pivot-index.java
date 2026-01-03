class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for(int num : nums)
        {
            totalsum += num;
        }
        int lefts=0;
        for(int i = 0 ; i < nums.length; i++)
        {
            if(lefts == totalsum - lefts - nums[i])
            {
                return i;
            }
            lefts += nums[i];
        }
        return -1;
}
}