class Solution {
    public int minCost(int n, int[][] edges) {
        List<int[]>[] forward = new ArrayList[n];
        List<int[]>[] backward = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            forward[i] = new ArrayList<>();
            backward[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            forward[e[0]].add(new int[]{e[1], e[2]});
            backward[e[1]].add(new int[]{e[0], e[2]});
        }

        long[][] dist = new long[n][2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE);
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        dist[0][0] = 0;
        pq.add(new long[]{0, 0, 0});

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long cost = cur[0];
            int node = (int) cur[1];
            int used = (int) cur[2];

            if (cost > dist[node][used]) continue;

            for (int[] e : forward[node]) {
                int next = e[0];
                long newCost = cost + e[1];
                if (newCost < dist[next][0]) {
                    dist[next][0] = newCost;
                    pq.add(new long[]{newCost, next, 0});
                }
            }

            if (used == 0) {
                for (int[] e : backward[node]) {
                    int next = e[0];
                    long newCost = cost + 2L * e[1];
                    if (newCost < dist[next][0]) {
                        dist[next][0] = newCost;
                        pq.add(new long[]{newCost, next, 0});
                    }
                }
            }
        }

        long ans = dist[n - 1][0];
        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }
}
