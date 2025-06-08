public class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) minIndex = i;
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);
        int n = nums.length;

        int case1 = right + 1;           
        int case2 = n - left;           
        int case3 = (left + 1) + (n - right);  

        return Math.min(case1, Math.min(case2, case3));
    }
}
