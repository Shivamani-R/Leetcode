class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int resStart = 0;   
        int resLen = 0;     

        for (int i = 0; i < s.length(); i++) {
            
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > resLen) {
                    resLen = r - l + 1;
                    resStart = l;
                }
                l--;
                r++;
            }

            
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > resLen) {
                    resLen = r - l + 1;
                    resStart = l;
                }
                l--;
                r++;
            }
        }

        
        return s.substring(resStart, resStart + resLen);
    }
}
