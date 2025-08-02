class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] mxl = new int[n]; 
        int[] mxr = new int[n]; 
        int water = 0;

        mxl[0] = height[0];
        for (int i = 1; i < n; i++) {
            mxl[i] = Math.max(height[i], mxl[i - 1]);
        }

        mxr[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            mxr[i] = Math.max(height[i], mxr[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            water += Math.min(mxl[i], mxr[i]) - height[i];
        }

        return water;
    }
}
