class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> st = new HashSet<>();
        int right = 0;
        int left = 0;
        for(right = 0 ; right < nums.length ;right++)
        {
            if(st.contains(nums[right]))
                return true;
                st.add(nums[right]);
            if(right - left  >= k)
            {
                st.remove(nums[left]);
                left++;
            }

        }
        return false;
        
    }
}