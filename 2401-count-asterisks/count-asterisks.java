class Solution {
    public int countAsterisks(String s) {
        int c=0;
        boolean flag=false;
        for(char z:s.toCharArray()){
            if(z=='|'){
                flag=!flag;
            }
            else if(z=='*'&& flag==false){
                c++;
            }
        }
      return c;  
    }
}