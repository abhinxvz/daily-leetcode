class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if( n < 3)
        return 0;
        int inc[] = new int[n];
        int dec[] = new int[n];
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                inc[i] = inc[i-1] + 1;
            }
        }
        for(int i = n - 2; i >= 1; i--)
        {
            if(arr[i] > arr[i+1])
            {
                dec[i] = dec[i+1] + 1;
            }
        }
        int maxi = 0;
        for(int i = 1; i < n-1 ; i++)
        {
            if(inc[i] > 0 && dec[i] > 0)
            {
                int curr = inc[i] + dec[i] + 1;
                maxi = Math.max(maxi,curr);
            }

        }
return maxi;
        }
}