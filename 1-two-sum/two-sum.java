class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> x = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int t = target - nums[i];
        if(x.containsKey(t)){
            return new int[] {x.get(t),i};
        }
        x.put(nums[i],i);
       }

       return null;
    }
}