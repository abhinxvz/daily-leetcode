class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder();
        int m = part.length();

        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));

            if (result.length() >= m) {
                if (result.substring(result.length() - m).equals(part)) {
                    result.delete(result.length() - m, result.length());
                }
            }
        }

        return result.toString();
    }
}