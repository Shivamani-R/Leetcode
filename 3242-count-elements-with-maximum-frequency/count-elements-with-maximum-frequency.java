class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] x = new int[101];

        for(int num:nums){
            x[num]++;
        }

        int max=0;
        for(int i=0;i<x.length;i++){
            max = Math.max(max,x[i]);
        }

        int res=0;
        for(int i=0;i<x.length;i++){
            if(x[i]==max){
                res+=x[i];
            }
            
        }
        return res;
    }
}