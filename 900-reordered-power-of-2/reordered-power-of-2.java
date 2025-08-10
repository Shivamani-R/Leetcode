class Solution {
    public boolean reorderedPowerOf2(int n) {
        String sortedN = sortDigits(n);
        
        for (int i = 0; i < 31; i++) { // 2^0 to 2^30 fits in int
            int power = 1 << i;
            if (sortedN.equals(sortDigits(power))) {
                return true;
            }
        }
        return false;
    }
    
    private String sortDigits(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
}
