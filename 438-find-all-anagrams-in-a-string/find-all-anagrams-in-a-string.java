class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();

        if (m < n) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(sCount, pCount)) {
            result.add(0);
        }

        for (int i = n; i < m; i++) {
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - n) - 'a']--;
            if (Arrays.equals(sCount, pCount)) {
                result.add(i - n + 1);
            }
        }

        return result;
    }
}
