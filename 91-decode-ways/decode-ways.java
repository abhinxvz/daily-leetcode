class Solution {
    public int numDecodings(String s) {
       int n = s.length();
       int dp[] = new int[n+1];
       dp[0] = 1;

       dp[1] = (s.charAt(0) == '0') ? 0 : 1;
       for(int i = 1; i < n; i++)
       {
        int curr = 0;
        if(s.charAt(i)!='0')
        curr+=dp[i];
        int two = (s.charAt(i-1) - '0') * 10 +(s.charAt(i)- '0');
        if(two >= 10 && two <= 26)
        curr+=dp[i-1];
        dp[i+1] = curr;

       }
       return dp[n];
    }
}