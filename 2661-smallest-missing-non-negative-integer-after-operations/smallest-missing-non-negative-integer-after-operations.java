class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n=nums.length;
        int[] count = new int[value];

        for(int i=0;i<n;i++){
            int rem = ((nums[i]%value)+value)%value;
            count[rem]++;
        }
        int mex=0;
        for(int i=0;i<Integer.MAX_VALUE;i++){
            int r=mex%value;
            if(count[r]>0){
                count[r]--;
                mex++;
            }
            else{
                break;
            }
        }
        return mex;
    }
}