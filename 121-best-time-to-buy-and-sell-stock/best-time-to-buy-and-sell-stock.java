class Solution {
    public int maxProfit(int[] prices) {
        int min_p = Integer.MAX_VALUE;
        int max_p = 0;
        for(int num : prices)
        {
            if(num < min_p)
            {
                min_p = num;
            }
            else {
            
           max_p = Math.max(max_p, num - min_p);
        }}
        return max_p;
        
    }
}