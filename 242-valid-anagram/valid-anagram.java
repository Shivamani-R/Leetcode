class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for (char c : s.toCharArray()) {
            sCount[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            pCount[c - 'a']++;
        }
        return Arrays.equals(sCount, pCount);

    }
}