class Solution {
    /**
     * Finds the length of the longest substring with repeating characters after at most k replacements.
     *
     * @param s The input string consisting of uppercase English letters.
     * @param k The maximum number of replacements allowed.
     * @return The length of the longest repeating character substring.
     */
    public int characterReplacement(String s, int k) {
        int left = 0; // Left pointer of the sliding window
        int maxLength = 0; // Stores the maximum length found so far
        int maxCharCount = 0; // Stores the frequency of the most frequent character in the current window

        // Frequency map for characters in the current window.
        // Since it's uppercase English letters, an array of size 26 is efficient.
        int[] charCounts = new int[26];

        // Iterate with the right pointer to expand the window
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Increment count of the current character and update maxCharCount
            charCounts[currentChar - 'A']++;
            maxCharCount = Math.max(maxCharCount, charCounts[currentChar - 'A']);

            // Calculate the current window length
            int windowLength = right - left + 1;

            // Check if the current window is valid.
            // A window is valid if (windowLength - maxCharCount) <= k,
            // meaning the number of characters that are NOT the most frequent one
            // can be replaced using at most k operations.
            if (windowLength - maxCharCount > k) {
                // If the window is invalid, shrink it from the left
                char charToRemove = s.charAt(left);
                charCounts[charToRemove - 'A']--; // Decrement count of the character leaving the window
                left++; // Move the left pointer
                
                // Note: maxCharCount is NOT updated here. It is implicitly handled
                // because we are interested in the largest possible window.
                // If maxCharCount is stale (higher than actual max in shrunk window),
                // it just means the condition (windowLength - maxCharCount > k) might
                // stay true for longer, causing 'left' to shrink more, which is fine
                // as we are only updating maxLength when the condition becomes true.
            }

            // Update the maximum length found so far.
            // This happens whether the window was valid from the start or
            // became valid after shrinking.
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}