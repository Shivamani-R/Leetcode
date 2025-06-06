class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> x = new HashMap<>();
        int currSum = 0;
        x.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            int remainder = currSum % k;

            if (x.containsKey(remainder)) {
                if (i - x.get(remainder) >= 2) {
                    return true;
                }
            } else {
                x.put(remainder, i);
            }
        }

        return false;
    }
}
