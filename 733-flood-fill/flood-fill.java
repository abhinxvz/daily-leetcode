class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentfill = image[sr][sc];
        if(currentfill == color) return image;
        dfs(image,sr,sc,currentfill,color);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int currentfill, int color)
    {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
        {
            return;
        }
        if(image[sr][sc]!=currentfill)
            return;
            image[sr][sc] = color; 
        dfs(image, sr - 1, sc, currentfill, color);
        dfs(image, sr + 1, sc, currentfill, color);
        dfs(image, sr, sc - 1 , currentfill,color);
        dfs(image, sr , sc + 1,currentfill, color);
    }
}