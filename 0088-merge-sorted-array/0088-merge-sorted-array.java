class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int totalLength = m+n-1;
         m = m-1; n=n-1;

        while(m>=0 && n>=0){
            if(nums2[n]>nums1[m]){
                nums1[totalLength] = nums2[n];
                n--;
            }else{
                nums1[totalLength] = nums1[m];
                m--;
            }
            totalLength--;
        }

        while(m>=0){
            nums1[totalLength] = nums1[m];
            m--;
            totalLength--;
        }
         while(n>=0){
            nums1[totalLength] = nums2[n];
            n--;
            totalLength--;
        }
        
    }
}