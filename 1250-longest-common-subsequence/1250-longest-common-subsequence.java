class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return solve(text1.toCharArray(), text2.toCharArray());
    }

    int solve(char a[], char b[]) {
        int n = a.length;
        int m = b.length;
        int[][] dp = new int[n + 1][m + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (a[i] == b[j]) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        return dp[0][0];
    }
}