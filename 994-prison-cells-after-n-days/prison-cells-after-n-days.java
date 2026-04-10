class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        int len = cells.length;
        n = n % 14;
        if (n == 0) n = 14;
        for(int day = 0; day < n; day++)
        {
            int result [] = new int[len];
            for(int i = 1; i < len-1; i++)
            {
                int left = cells[i-1];
                int right = cells[i+1];
                if(left == right)
                {
                    result[i] = 1;
                }
                else {
                    result[i] = 0;
                }
            }
            cells = result;
        }
        return cells;

        }
}