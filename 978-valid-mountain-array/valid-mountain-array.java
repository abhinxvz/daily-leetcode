class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n < 3)
        return false;
        int increasing[] = new int[n];
        int decreasing[] = new int[n];
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                increasing[i] = increasing[i-1] + 1;

            }
            
        }
          for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                decreasing[i] = decreasing[i + 1] + 1;
            }
        }
        for (int i = 1; i < n-1; i++) {
            if(increasing[i] > 0 && decreasing[i] > 0 && increasing[i] + decreasing[i] == n - 1) {
             
                return true;
        }

    }
    return false;
    }
}