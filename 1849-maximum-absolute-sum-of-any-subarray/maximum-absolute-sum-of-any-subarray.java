class Solution {
    public int maxAbsoluteSum(int[] nums) {
    
        int minE = 0, minS = 0;
        int maxE = 0, maxS = 0;
        for(int x : nums)
        {
            minE= Math.min(x, minE + x);
            minS = Math.min(minS, minE);
            maxE= Math.max(x, maxE + x);
            maxS = Math.max(maxS, maxE);
            
        
    }
    return Math.max(Math.abs(minS),Math.abs(maxS));
    }

}