class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int x : nums)
        {
            set.add(x);
        }
        int i = 0;
        for(int x : set)
        {
        nums[i] = x;
        i++;
        }
        return i;
    }
}