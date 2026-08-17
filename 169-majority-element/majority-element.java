class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
        {
            int count = map.getOrDefault(x,0) + 1;
            if(count > nums.length/2)
            {
            return x;
        }
        map.put(x,count);
    }
    return -1;
}}