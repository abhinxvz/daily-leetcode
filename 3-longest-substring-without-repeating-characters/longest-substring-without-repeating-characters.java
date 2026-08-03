class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();
        int maxlen = 0;
        while(right < n)
        {
            char ch = s.charAt(right);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxlen = Math.max(maxlen, right - left + 1);
            right++;

        }
        return maxlen;
    }
}