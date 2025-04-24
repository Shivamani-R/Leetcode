class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        for (int num : nums) {
            distinct.add(num);
        }
        int totalDistinct = distinct.size();
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> windowSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                windowSet.add(nums[j]);
                if (windowSet.size() == totalDistinct) {
                    count += (n - j);
                    break;
                }
            }
        }
        return count;
    }
}
