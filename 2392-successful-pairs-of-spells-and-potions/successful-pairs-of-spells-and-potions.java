class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res = new int[spells.length];
        int n = potions.length;

        for (int i = 0; i < spells.length; i++) {
            long minPotion = (success + spells[i] - 1) / spells[i];
            int idx = lowerBound(potions, minPotion);
            res[i] = n - idx;
        }
        return res;
    }

    private int lowerBound(int[] potions, long target) {
        int l = 0, r = potions.length-1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (potions[mid] < target) l = mid + 1;
            else r = mid-1;
        }
        return l;
    }
}