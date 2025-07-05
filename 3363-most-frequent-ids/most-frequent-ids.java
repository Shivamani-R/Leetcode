import java.util.*;

class Solution {
    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        Map<Integer, Long> countMap = new HashMap<>();
        TreeMap<Long, Integer> freqCountMap = new TreeMap<>();
        long[] result = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int id = nums[i];
            int delta = freq[i];

            long oldFreq = countMap.getOrDefault(id, 0L);
            long newFreq = oldFreq + delta;

            if (oldFreq > 0) {
                freqCountMap.put(oldFreq, freqCountMap.get(oldFreq) - 1);
                if (freqCountMap.get(oldFreq) == 0) {
                    freqCountMap.remove(oldFreq);
                }
            }

            if (newFreq > 0) {
                countMap.put(id, newFreq);
                freqCountMap.put(newFreq, freqCountMap.getOrDefault(newFreq, 0) + 1);
            } else {
                countMap.remove(id);
            }

            result[i] = freqCountMap.isEmpty() ? 0 : freqCountMap.lastKey();
        }

        return result;
    }
}
