class Solution {
    public int minLengthAfterRemovals(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        return Math.abs(2*count-s.length());
    }
}