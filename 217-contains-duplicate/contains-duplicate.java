class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set= new HashSet<>();
        int n = nums.length;
        for(int num : nums)
        {
            set.add(num);
        }
        return set.size() < n;
    }
}