class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        long ans = 0;
        int prefix = 0;
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);

        for (int num : nums) {
            if (num % modulo == k) {
                prefix = (prefix + 1) % modulo;
            }
            int target = (prefix - k + modulo) % modulo;
            ans += prefixCount.getOrDefault(target, 0);
            prefixCount.put(prefix, prefixCount.getOrDefault(prefix, 0) + 1);
        }

        return ans;
    }
}