class Solution {
    public int maxProfit(int[] prices) {
        int max_p = 0;
        int min_p = Integer.MAX_VALUE;

        for(int num : prices)
        {
            if(num < min_p)
            {
                min_p = num;
            }
            max_p = Math.max(max_p, num - min_p);
        }
        return max_p;
    }
}