class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int right = 0;
        int left = 0;
        int lastseen [] = new int[65536];
        int maxi = 0;
        Arrays.fill(lastseen, -1);
        for(right = 0 ; right < n; right++)
        {
            char c = s.charAt(right);
            if(lastseen[c] >= left)
            {
               left = lastseen[c] + 1;
            }

            lastseen[c] = right;
            maxi = Math.max(maxi, right - left + 1);

        }
return maxi;

    }
}
    