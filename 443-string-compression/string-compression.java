class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;

        for(int i=0;i<n;i++){
            char curr = chars[i];
            int count = 0;

            while(i<n && chars[i]==curr){
                count++;
                i++;
            }

            if(count==1){
                chars[idx++]=curr;
            }
            else{
                chars[idx++]=curr;
                for(char c:String.valueOf(count).toCharArray()){
                    chars[idx++]=c;
                }
            }
            i--;
        }

        return idx;
    }
}
