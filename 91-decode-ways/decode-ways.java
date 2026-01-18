class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;
        int prev1 = 1;
        int prev2 = 1;
        for(int right = 1; right < s.length(); right++)
        { 
            int curr = 0;
            if(s.charAt(right)!='0') curr+= prev1;
            int two = (s.charAt(right-1)-'0') * 10 + (s.charAt(right) - '0');
            if(two >= 10 && two<=26)
            curr+=prev2;

            prev2 = prev1;
            prev1 = curr;
          


        }
        return prev1;
    }
}