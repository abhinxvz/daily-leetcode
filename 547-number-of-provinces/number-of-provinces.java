class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(!visited[i])
            {
                dfs(isConnected,visited,i);
                provinces++;
            }
        }
        return provinces;
        
    }
    private void dfs(int[][] isConnected, boolean[] visited, int city)

    {
        int n = isConnected.length;
     visited[city] = true;
     for(int neighbour = 0 ; neighbour < n; neighbour++)
     {
        if(isConnected[city][neighbour] == 1 && !visited[neighbour]) {
                dfs(isConnected, visited, neighbour);
        }
     }    

    }
}
