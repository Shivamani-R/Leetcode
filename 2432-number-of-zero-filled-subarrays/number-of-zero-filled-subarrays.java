class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long zeroStreak = 0;

        for (int num : nums) {
            if (num == 0) {
              
                zeroStreak++;
              
                count += zeroStreak;
            } else {
               
                zeroStreak = 0;
            }
        }
        
        return count;
    }
}