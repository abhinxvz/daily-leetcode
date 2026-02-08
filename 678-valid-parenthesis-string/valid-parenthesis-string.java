class Solution {
    public boolean checkValidString(String s) {
        int mini = 0;
        int maxi = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                mini++;
                maxi++;
            }
            else if( c == ')')
            {
                mini--;
                maxi--;
            }
            else {
                mini--;
                maxi++;
            }
            if(maxi < 0) return false;
            if(mini < 0) mini = 0;
        }
        return mini == 0;
    }
}