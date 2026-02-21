class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> indices = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < n; i++)
        {
            if(nums[i] == x) {
                indices.add(i);
            }
        }
        int ans[] = new int[queries.length];
        for(int i = 0; i < queries.length; i++)
        {
            int occurrences = queries[i];
            if(occurrences <= indices.size())
            {
                ans[i] = indices.get(occurrences - 1);
            }
            else 
            {
                ans[i] = -1;
            }
        }
        return ans;
    }
}