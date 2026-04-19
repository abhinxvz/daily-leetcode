class Solution {
    public String frequencySort(String s) {
        int freq[] = new int[128];
        int n = s.length();
        for(char c : s.toCharArray())
        {
            freq[c]++;
        }
        Character [] arr = new Character[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr, (a, b) -> {
            if(freq[a] != freq[b]) {
                return freq[b] - freq[a]; // higher freq first
            }
            return a - b; // tie → lexicographically smaller first
        });
                StringBuilder result = new StringBuilder();

        for(char c : arr) {
            result.append(c);
        }

        return result.toString();
    }
}

        
 