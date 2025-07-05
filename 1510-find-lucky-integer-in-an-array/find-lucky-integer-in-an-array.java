class Solution {
    public int findLucky(int[] arr) {
        int max = -1;
        HashMap<Integer, Integer> x = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            x.put(arr[i], x.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : x.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (key == value) {
                max = Math.max(max, key);
            }
        }

        return max;
    }
}
