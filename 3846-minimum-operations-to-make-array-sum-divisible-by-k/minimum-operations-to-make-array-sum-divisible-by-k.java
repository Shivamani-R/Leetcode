class Solution {
    public int minOperations(int[] nums, int k) {
        int ts=0;
        for(int num:nums){
            ts += num;
        }
        return ts%k;
    }
}