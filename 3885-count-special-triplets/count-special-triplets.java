class Solution {
    private static final long MOD = 1_000_000_007;

    public int specialTriplets(int[] nums) {
        HashMap<Integer, Integer> right = new HashMap<>();
        HashMap<Integer, Integer> left = new HashMap<>();

        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0) + 1);
        }

        long result = 0;

        for (int val : nums) {

            right.put(val, right.get(val) - 1);
            // if (right.get(val) == 0) {
            //     right.remove(val);
            // }

            int target = val * 2;
            long leftCount = left.getOrDefault(target, 0);
            long rightCount = right.getOrDefault(target, 0);

            result = (result + (leftCount * rightCount) % MOD) % MOD;

            left.put(val, left.getOrDefault(val, 0) + 1);
        }

        return (int) result;  
    }
}
