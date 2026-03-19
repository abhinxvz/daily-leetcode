class Solution {
    public int lengthOfLongestSubstring(String s) {
       int lastindex [] = new int [256];
       int left = 0;
       int maxi = 0;
       Arrays.fill(lastindex,-1);
       for(int right = 0 ; right < s.length(); right++)
       {
        char c = s.charAt(right);
        if(lastindex[c] >= left)
        {
            left = lastindex[c] + 1;
            
        }
    
            lastindex[c] = right;
        
        maxi = Math.max(maxi,right - left + 1);
       }
       return maxi;
    }
}