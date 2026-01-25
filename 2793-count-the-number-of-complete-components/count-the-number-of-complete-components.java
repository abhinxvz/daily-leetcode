class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n ; i++)
            adj.add(new ArrayList<>());
            for(int e[] : edges)
            {
                adj.get(e[0]).add(e[1]);
                adj.get(e[1]).add(e[0]);

            }
            boolean visited[] = new boolean[n];
            int count = 0;
            for(int i = 0; i < n; i++)
            { 
                if(!visited[i]) {
                int info[] = new int[2];
                dfs(adj,visited,i,info);
                int degreesum = info[1];
                int node = info[0];
                int edgesinc = degreesum / 2;
                int totaledges = (node * (node - 1))/2;
                if(edgesinc == totaledges) count++;
                }}
                return count;
        }
        private static void dfs(ArrayList<ArrayList<Integer>> adj,boolean visited[],int node, int[] info)
        {
            visited[node] = true;
        info[0]++;
        info[1] += adj.get(node).size();

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(adj, visited, neighbor, info);
        }
                
                
            }
            
        }
        

}