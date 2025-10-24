class Solution {
    public int nextBeautifulNumber(int n) {
        int num=n+1;
        while(true){
            if(isbalanced(num)){
                return num;
            }
            num++;
        }
        
    }
    private boolean isbalanced(int number){
        int temp=number;
        int[] count = new int[10];

        while(temp>0){
            int r=temp%10;
            count[r]++;
            temp/=10;
        }
        for (int d = 0; d <= 9; d++) {
            if (count[d] > 0 && count[d] != d){
                return false;
            }
        }

        return true;
    }
}