class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        for (int key : map.keySet()) {
            int groupSize = key + 1;
            int count = map.get(key);
            int numberOfGroups = (count + groupSize - 1) / groupSize;
            result += numberOfGroups * groupSize;
        }

        return result;
    }
}