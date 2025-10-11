class Solution {
    public long maximumTotalDamage(int[] power) {
        if (power == null || power.length == 0) return 0L;

        Map<Long, Long> map = new HashMap<>();
        for (int p : power) {
            long key = (long) p;
            map.put(key, map.getOrDefault(key, 0L) + key);
        }

        List<Long> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int n = keys.size();
        long[] dp = new long[n];
        dp[0] = map.get(keys.get(0));

        for (int i = 1; i < n; i++) {
            long curr = map.get(keys.get(i));
            long target = keys.get(i) - 3;
            int idx = Collections.binarySearch(keys, target);
            int j;
            if (idx >= 0) j = idx;
            else j = -idx - 2;

            long include = curr + (j >= 0 ? dp[j] : 0L);
            long exclude = dp[i - 1];
            dp[i] = Math.max(exclude, include);
        }

        return dp[n - 1];
    }

}
