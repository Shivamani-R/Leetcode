class Solution {
    public int countAsterisks(String s) {
        int n = s.length();
        boolean found = false;
        int countAsterik = 0;
        
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '|' ){
                found = !found;
            }
            if(ch == '*' && found == false){
                countAsterik++;
            }
        }
        return countAsterik;
    }
}