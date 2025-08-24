class Solution {
    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }

        boolean[] x = new boolean[n];
        Arrays.fill(x,true);
        x[0]=false;
        x[1]=false;
        

        for(int i=2;i*i<n;i++){
            if(x[i]){
                for(int j=i*i;j<n;j+=i){
                    x[j]=false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(x[i]){
                count++;
            }
        }
    return count;
        
    }
}