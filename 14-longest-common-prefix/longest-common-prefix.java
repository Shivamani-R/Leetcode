public class Solution {
    public String longestCommonPrefix(String[] v) {
        if (v == null || v.length == 0) {
            return "";
        }

        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}