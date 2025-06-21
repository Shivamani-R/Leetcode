import java.util.*;

public class Solution {
    public int minimumDeletions(String word, int k) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        List<Integer> freqs = new ArrayList<>(freqMap.values());
        Collections.sort(freqs);

        int n = freqs.size();
        int minDeletions = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int base = freqs.get(i);
            int maxAllowed = base + k;
            int deletions = 0;

            for (int j = 0; j < n; j++) {
                int f = freqs.get(j);
                if (f < base) {
                    deletions += f; 
                } else if (f > maxAllowed) {
                    deletions += f - maxAllowed; 
                }
            }

            minDeletions = Math.min(minDeletions, deletions);
        }

        return minDeletions;
    }
}
