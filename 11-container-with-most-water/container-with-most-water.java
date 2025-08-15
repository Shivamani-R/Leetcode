class Solution {
    public int maxArea(int[] height) {
       int maxa = 0;
       int i=0,j=height.length-1;

        while(i<j){
            int mini = Math.min(height[i],height[j]);
            int width = j-i;

            int area = mini*width;

            maxa = Math.max(maxa,area);

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxa;
    }
}