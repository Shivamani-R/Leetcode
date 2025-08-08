class Solution {
    private Double[][] memo;

    public double soupServings(int n) {
        if (n > 4800) return 1.0;
        int N = (n + 24) / 25;
        memo = new Double[N + 1][N + 1];
        return dp(N, N);
    }

    private double dp(int a, int b) {
        if (a <= 0 && b <= 0) return 0.5;
        if (a <= 0) return 1.0;
        if (b <= 0) return 0.0;
        if (memo[a][b] != null) return memo[a][b];

        double res = 0.0;
        res += 0.25 * dp(a - 4, b);
        res += 0.25 * dp(a - 3, b - 1);
        res += 0.25 * dp(a - 2, b - 2);
        res += 0.25 * dp(a - 1, b - 3);

        memo[a][b] = res;
        return res;
    }
}
