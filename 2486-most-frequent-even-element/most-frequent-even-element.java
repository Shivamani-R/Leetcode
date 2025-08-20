
class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> x = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
            x.put(nums[i],x.getOrDefault(nums[i],0)+1);
            }
        }
        int ans=-1;
        int maxfre=0;
        for(int key:x.keySet()){
            int fre = x.get(key);

            if(fre>maxfre || (fre==maxfre && key<ans)){
                maxfre=fre;
                ans=key;
            }
        }

        return ans;
    }
}
