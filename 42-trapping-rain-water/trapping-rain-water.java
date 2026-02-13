class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n -1;
        int maxleft = 0, maxright = 0;
        int total = 0;
        while(left < right)
        {
            if(height[left] < height[right])
            {
            if(maxleft <= height[left])
            {
                maxleft = height[left];

            }
            else {
                total += maxleft - height[left];
            }
            left++;
            }

            else {
                if(maxright <= height[right])
            {
                maxright = height[right];

            }
            else {
                total += maxright - height[right];
            }
            right--;
            }
        }
        return total;
    }}


