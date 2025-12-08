class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int s = (i*i)+(j*j);
                int ss = (int) Math.sqrt(s);
                if(s==ss*ss && ss<=n){
                    count++;
                }

            }
        }
        return count;
    }
}