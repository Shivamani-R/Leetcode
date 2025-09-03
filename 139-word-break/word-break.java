class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> x = new HashSet<>(wordDict);
        boolean[] y = new boolean[s.length()+1];

        y[0] = true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(y[j] && x.contains(s.substring(j, i))){
                    y[i]=true;
                    break;
                }
            }
        }
        return y[s.length()];
    }
}