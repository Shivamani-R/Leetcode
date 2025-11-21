class Solution {
    public int countPalindromicSubsequence(String s) {
       int n = s.length();
       int[] first = new int[26];
       int[] last = new int[26];

       for (int i = 0; i < 26; i++) {
            first[i] = Integer.MAX_VALUE;
            last[i] = Integer.MIN_VALUE;
        }

       for(int i=0;i<n;i++){
        int c = s.charAt(i)-'a';
        first[c]=Math.min(first[c],i);
        last[c]=Math.max(last[c],i);
       }
        int res=0;
        for(int i=0;i<26;i++){
        if(first[i]<last[i]){
            HashSet<Character> x = new HashSet<>();

            for(int j=first[i]+1;j<last[i];j++){
                x.add(s.charAt(j));
            }
            res+=x.size();
        }
       }
    return res;
    }
}