class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ArraySum = 0;
        int totalsum = n*(n+1)/2;
        for(int num : nums)
        {
            ArraySum+=num;
        }
        return totalsum - ArraySum;
    }
}