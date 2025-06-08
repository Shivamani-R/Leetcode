class Solution {
    public int balancedStringSplit(String s) {
        int b=0;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='R'){
                b++;
            }
            else if(ch=='L'){
                b--;
            }
            if(b==0){
                c++;
            }
        }
        return c;
    }
}