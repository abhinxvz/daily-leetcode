class Solution {
     private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;

        int l = 0, r = 0;
        int sum = 0;
        int cnt = 0;

        while (r < nums.length) {
            sum += nums[r]%2;

            while (sum > goal) {
                sum -= nums[l]%2;
                l++;
            }

            cnt += (r - l + 1);
            r++;
        }

        return cnt;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}
        
   