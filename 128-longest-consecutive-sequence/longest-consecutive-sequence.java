class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
                int longest = 0;

       for(int num : nums)
       {
        set.add(num);
       }
       for(int num : set)
       {
        if(!set.contains(num-1))
        {
            int currentnum = num;
            int length = 1;
            while(set.contains(currentnum + 1))
            {
                currentnum++;
                length++;
            }
            longest = Math.max(longest,length);
        }}
        return longest;
       }}
    
    
