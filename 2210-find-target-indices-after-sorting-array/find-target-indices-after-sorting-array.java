class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> y = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                y.add(i);
            }
        }
        return y;
    }
}