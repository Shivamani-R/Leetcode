class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }
            else{
                max = Math.max(max,count);
                count = 1;
            }

        }
        return Math.max(max,count);
    }
}