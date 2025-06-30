class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < nums.length; right++) {
            int curr = nums[right];
            freq.put(curr, freq.getOrDefault(curr, 0) + 1);

            while (freq.get(curr) > k) {
                int leftVal = nums[left];
                freq.put(leftVal, freq.get(leftVal) - 1);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
