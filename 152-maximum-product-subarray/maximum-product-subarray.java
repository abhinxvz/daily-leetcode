class Solution {
    public int maxProduct(int[] nums) {
        int s = 1;
        int p = 1;
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(p == 0) 
            p = 1;
            if(s == 0)
            s = 1;
            p *= nums[i];
            s *= nums[n-1-i];
            maxi = Math.max(maxi,Math.max(p,s));

        }
        return maxi;
    }
}