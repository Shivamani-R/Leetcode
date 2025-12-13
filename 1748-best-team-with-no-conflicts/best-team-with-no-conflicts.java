class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n=scores.length;
       int[][] p = new int[n][2];
        for (int i = 0; i < n; i++) {
            p[i][0] = ages[i];
            p[i][1] = scores[i];
        }
        Arrays.sort(p, (a, b) -> 
            a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );

        int[] dp = new int[n];
        int best = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = p[i][1]; 

            for (int j = 0; j < i; j++) {
                if (p[j][1] <= p[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + p[i][1]);
                }
            }

            best = Math.max(best, dp[i]);
        }

        return best;
    }
}
