class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            result[i] = -1;
            for(int j = 1; j < n; j++)
            {
                int nextind = (i+j) % n;
                if(nums[nextind] > nums[i])
                {
                    result[i] = nums[nextind];
                    break;
                }
            }
        }
        return result;
        
    }
}