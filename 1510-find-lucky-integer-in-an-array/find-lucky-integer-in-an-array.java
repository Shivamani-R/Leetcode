class Solution {
    public int findLucky(int[] arr) {
        int max = -1;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (key == value) {
                max = Math.max(max, key);
            }
        }

        return max;
    }
}
