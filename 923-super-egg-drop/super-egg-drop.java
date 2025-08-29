class Solution {
    static int[][] dp;
    
    static int superEggDrop(int n, int k) {
        dp = new int[n+1][k+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n, k);
    }
    
    private static int solve(int n, int k) {
        if (k == 0 || k == 1) return k;
        if (n == 1) return k;
        
        if (dp[n][k] != -1) return dp[n][k];
        
        int low = 1, high = k, ans = Integer.MAX_VALUE;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            int breakCase = solve(n - 1, mid - 1);
            int surviveCase = solve(n, k - mid);
            
            int worst = 1 + Math.max(breakCase, surviveCase);
            ans = Math.min(ans, worst);
            
            if (breakCase > surviveCase) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return dp[n][k] = ans;
    }
}
