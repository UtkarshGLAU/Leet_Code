class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int dp[][] = new int[n + 2][m + 2];

        for (int i = 0; i <= n + 1; i++) {
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][m + 1] = Integer.MAX_VALUE;
        }
        for (int i = 0; i <= m + 1; i++) {
            dp[0][i] = Integer.MAX_VALUE;
            dp[n + 1][i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    dp[i + 1][j + 1] = 0;
                } else {
                    dp[i + 1][j + 1] = Integer.MAX_VALUE;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int val = Math.min(dp[i - 1][j], dp[i][j - 1]);
                if (val != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i][j], val + 1);
                }
            }
        }

        for (int i = n; i > 0; i--) {
            for (int j = m; j > 0; j--) {
                int val = Math.min(dp[i + 1][j], dp[i][j + 1]); 
                if (val != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i][j], val + 1);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = dp[i + 1][j + 1];
            }
        }

        return mat;
    }
}
