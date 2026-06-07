class Solution {
    private int maximum(int[]piles)
    {

        int maxi = 0;
        int n = piles.length;
        for(int i = 0; i < n; i++)
        {
            maxi = Math.max(maxi,piles[i]);

        }
        return maxi;

    }
    private double hourlycap(int hours, int[] piles)
    { 
        double totalH = 0;
        int n = piles.length;
        for(int i = 0; i < n; i++)
        {
          totalH += Math.ceil((double) piles[i] / hours);

        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 0;
        int high = maximum(piles);
        while(low <= high)
        {
            int mid = (low + high) / 2;
            double totalhours = hourlycap(mid,piles);
            if(totalhours <= h)
            {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
    return low;
        
    }
}