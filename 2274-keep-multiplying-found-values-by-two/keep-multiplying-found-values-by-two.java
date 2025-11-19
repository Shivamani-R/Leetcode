class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> x = new HashSet<>();
        for(int num:nums){
            x.add(num);
        }
        
            while(x.contains(original)){
                original = 2 * original;
            }
        
        return original;
    }
}