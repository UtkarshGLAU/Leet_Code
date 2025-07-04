class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == '1') {
                    ans++;
                    solve(grid, i, j);
                }
        return ans;
    }

    void solve(char[][] grid, int i, int j) {
        if (i >= grid.length || i < 0 || j < 0 || j >= grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        solve(grid, i - 1, j);
        solve(grid, i, j - 1);
        solve(grid, i + 1, j);
        solve(grid, i, j + 1);
    }
}