class Solution {
    public boolean findSubarrays(int[] nums) {
        int k = 2, sum = 0;
        int n = nums.length;
        HashSet<Integer> x = new HashSet<>();
        int left = 0, right = 0;

        while (right < n) {
            sum += nums[right];

            if (right - left + 1 > k) {
                sum -= nums[left];
                left++;
            }

            if (right - left + 1 == k) {
                if (x.contains(sum)) {
                    return true;
                }
                x.add(sum);
            }

            right++;
        }
        return false;
    }
}
