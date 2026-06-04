class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if(s.length() != t.length()) 
        {
            return false;
        }
        int m1[] = new int[256];
        int m2[] = new int[256];
        for(int i = 0; i < n; i++)
        {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(m1[c] != m2[d])

                return false;
                m1[c] = i+1;
                m2[d] = i+1;
            }
            return true;
        
    }
}