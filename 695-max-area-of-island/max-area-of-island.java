class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxarea = 0;
        for(int row = 0 ; row < rows; row++)
        {
            for(int col = 0; col < cols ; col++)
            {
                if(grid[row][col]==1)
                {
                  int currentarea = dfs(grid,row,col,rows,cols); 
                
                maxarea = Math.max(maxarea,currentarea);
                }}
        }
        return maxarea;
    
    }
    private int dfs(int grid[][],int row,int col,int rows,int cols)
    {
        if(row < 0 || row >= rows || col < 0 || col>=cols || grid[row][col]==0)
        {
            return 0;
        }
        grid[row][col] = 0;
        int area = 1;
         area += dfs(grid, row + 1, col, rows, cols);
        area += dfs(grid, row - 1, col, rows, cols);
        area += dfs(grid, row, col + 1, rows, cols);
        area += dfs(grid, row, col - 1, rows, cols);
        return area;
    }
}