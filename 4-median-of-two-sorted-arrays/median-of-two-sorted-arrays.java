class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] temp=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(nums1[i]>nums2[j]){
                temp[k]=nums2[j];
                k++;
                j++;
            }
            else{
                temp[k]=nums1[i];
                k++;
                i++;
            }
        }
        while(i<m){
            temp[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n){
            temp[k]=nums2[j];
            k++;
            j++;
        }
        double res=0;
        int length=temp.length;
        if(length%2==0){
            res=((temp[length/2])+(temp[(length/2)-1]))/2.0;
        }
        else res=temp[length/2];
        return res;
    }
}
