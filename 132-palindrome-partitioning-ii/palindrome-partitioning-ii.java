class Solution {
    static int[][] dp;
    public int minCut(String s) {
        int n = s.length();
        dp = new int[n+1][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(s,0,n-1);
    }
    private static int solve(String s , int i , int j){
        if(i>=j || isPal(s,i,j)) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        int min = Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            if(isPal(s,i,k)){
                int cost = 1 + solve(s,k+1,j);
                min = Math.min(min,cost);
            }
        }
        return dp[i][j] = min;
    }

    private static boolean isPal(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}