class Solution {
    static final int MOD = 1_000_000_007;
    static final int MAX = 10010;
    long[][] comb = new long[MAX][20];

    public int idealArrays(int n, int maxValue) {
        // Precompute combinations C[n][k] = nCk
        for (int i = 0; i < MAX; i++) {
            comb[i][0] = 1;
            for (int j = 1; j < 20 && j <= i; j++) {
                comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % MOD;
            }
        }

        // dp[val][len] = number of sequences of length len ending with val
        int maxLen = 14; // log2(10^4) = 14
        long[][] dp = new long[maxValue + 1][maxLen + 1];
        
        // Initialize: len=1
        for (int i = 1; i <= maxValue; i++) {
            dp[i][1] = 1;
        }

        for (int len = 2; len <= maxLen; len++) {
            for (int i = 1; i <= maxValue; i++) {
                for (int j = 2 * i; j <= maxValue; j += i) {
                    dp[j][len] = (dp[j][len] + dp[i][len - 1]) % MOD;
                }
            }
        }

        long result = 0;
        for (int val = 1; val <= maxValue; val++) {
            for (int len = 1; len <= maxLen; len++) {
                result = (result + dp[val][len] * comb[n - 1][len - 1]) % MOD;
            }
        }

        return (int) result;
    }
}
