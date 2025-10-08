class Solution {
    public int search(int[] nums, int target) {
     int s = 0;
     int e = nums.length;
     while(s<e){
        int m = s+(e-s)/2;
        if(nums[m]==target){
            return m;
        }
        else if(nums[m]>target){
            e = m;
        }
        else{
            s = m+1;
        }
     } 
     return -1;
    }
}