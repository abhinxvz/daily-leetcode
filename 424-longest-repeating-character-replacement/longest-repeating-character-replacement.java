class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max_count = 0;
        int max_length = 0;
        int count[] = new int [256];
        for(int right = 0 ; right < s.length(); right++)
        {
            int ch = s.charAt(right) - 'A';
            count[ch]++;
            max_count = Math.max(max_count,count[ch]);

        while((right - left + 1) - max_count > k)
        {
            count[s.charAt(left)- 'A']--;
            left++;


        }
        max_length = Math.max(max_length, right-left+1);
    }
    return max_length;
}}