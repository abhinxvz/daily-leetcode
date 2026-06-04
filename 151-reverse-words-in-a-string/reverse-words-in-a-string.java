class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = a.length;
        for(int i = n - 1; i >= 0; i--)
        {
            sb.append(a[i]).append(" ");
        }
        return sb.toString().trim();
    }
}