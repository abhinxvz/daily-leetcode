class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] rowPref = new int[m][n + 1];
        int[][] colPref = new int[m + 1][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowPref[i][j + 1] = rowPref[i][j] + grid[i][j];
                colPref[i + 1][j] = colPref[i][j] + grid[i][j];
            }
        }

        int[][] diag1 = new int[m + 1][n + 1];
        int[][] diag2 = new int[m + 1][n + 2];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diag1[i + 1][j + 1] = diag1[i][j] + grid[i][j];
                diag2[i + 1][j] = diag2[i][j + 1] + grid[i][j];
            }
        }

        int maxK = Math.min(m, n);

        for (int k = maxK; k >= 2; k--) {
            for (int r = 0; r + k <= m; r++) {
                for (int c = 0; c + k <= n; c++) {
                    if (isMagic(grid, rowPref, colPref, diag1, diag2, r, c, k)) return k;
                }
            }
        }

        return 1;
    }

    private boolean isMagic(int[][] grid, int[][] rowPref, int[][] colPref,
                            int[][] diag1, int[][] diag2,
                            int r, int c, int k) {

        int target = rowPref[r][c + k] - rowPref[r][c];

        int d1 = diag1[r + k][c + k] - diag1[r][c];
        if (d1 != target) return false;

        int d2 = diag2[r + k][c] - diag2[r][c + k];
        if (d2 != target) return false;

        for (int i = 0; i < k; i++) {
            int rowSum = rowPref[r + i][c + k] - rowPref[r + i][c];
            if (rowSum != target) return false;

            int colSum = colPref[r + k][c + i] - colPref[r][c + i];
            if (colSum != target) return false;
        }

        return true;
    }
}
