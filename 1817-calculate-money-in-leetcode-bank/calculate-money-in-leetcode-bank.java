class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int week = i / 7;
            int day = i % 7;
            sum += week+day+1;
        }
        return sum;
    }
}