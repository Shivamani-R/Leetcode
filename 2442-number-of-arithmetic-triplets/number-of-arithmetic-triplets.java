class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> numSet = new HashSet<>();
        int count = 0;
         for (int num : nums) {numSet.add(num);
        }
        for (int num : nums) {
            if (numSet.contains(num - diff) && numSet.contains(num - 2 * diff)) {
                count++;
            }
            // numSet.add(num);
        }
        return count;
    }
}