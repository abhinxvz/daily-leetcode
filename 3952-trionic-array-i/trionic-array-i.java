class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int state = 0;
        int increasingCount = 0;
        int decreasingCount = 0;

        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1])
                return false;

            if (state == 0) {
                if (nums[i] > nums[i - 1]) {
                    increasingCount++;
                } else {
                    if (increasingCount == 0) return false;
                    state = 1;
                    decreasingCount++;
                }
            } 
            else if (state == 1) {
                if (nums[i] < nums[i - 1]) {
                    decreasingCount++;
                } else {
                    if (decreasingCount == 0) return false;
                    state = 2;
                }
            } 
            else {
                if (nums[i] < nums[i - 1])
                    return false;
            }
        }

        return state == 2;
    }
}
