class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int sumLeft = 0, sumRight = 0;

                for (int l = 0; l < i; l++) sumLeft += nums[l];
                for (int r = i + 1; r < n; r++) sumRight += nums[r];

                if (sumLeft == sumRight) count += 2;
                else if (sumLeft + 1 == sumRight) count += 1;
                else if (sumRight + 1 == sumLeft) count += 1;
            }
        }

        return count;
    }
}
