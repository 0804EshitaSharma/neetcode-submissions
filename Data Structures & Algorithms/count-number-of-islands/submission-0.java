class Solution {

    int[] x = {0, 0, -1, 1};
    int[] y = {1, -1, 0, 0};

    public void dfs(int src_x, int src_y, boolean[][] isVisited, char[][] grid) {

        isVisited[src_x][src_y] = true;

        for (int i = 0; i < x.length; i++) {

            int row = src_x + x[i];
            int col = src_y + y[i];

            // Check boundaries first
            if (row >= 0 && row < grid.length &&
                col >= 0 && col < grid[0].length &&
                grid[row][col] == '1' &&
                !isVisited[row][col]) {

                dfs(row, col, isVisited, grid);
            }
        }
    }

    public int numIslands(char[][] grid) {

        int result = 0;

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] isVisited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !isVisited[i][j]) {

                    dfs(i, j, isVisited, grid);
                    result++;
                }
            }
        }

        return result;
    }
}