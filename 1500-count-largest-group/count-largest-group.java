class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            countMap.put(sum, countMap.getOrDefault(sum, 0) + 1);
        }

        int maxSize = 0;
        for (int size : countMap.values()) {
            maxSize = Math.max(maxSize, size);
        }

        int res = 0;
        for (int size : countMap.values()) {
            if (size == maxSize) {
                res++;
            }
        }

        return res;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
