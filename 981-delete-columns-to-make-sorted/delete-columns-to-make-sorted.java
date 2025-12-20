class Solution {
    public int minDeletionSize(String[] strs) {
        int r = strs.length;
        int c = strs[0].length();
        int Count = 0;

        for (int col = 0; col < c; col++) {
            for (int row = 1; row < r; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    Count++;
                    break;
                }
            }
        }

        return Count;
        
    }
}