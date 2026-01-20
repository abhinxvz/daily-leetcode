class Solution {
    public int maxProduct(int[] nums) {
        int maxP = nums[0];
        int minP = nums[0];
        int ans =  nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            int x = nums[i];
            if(x< 0)
            {
                int temp = maxP;
                maxP = minP;
                minP = temp;
            }
            maxP = Math.max(x , maxP*x);
            minP = Math.min(x , minP*x);
            ans = Math.max(ans,maxP);


        }
        return ans;
    }
}