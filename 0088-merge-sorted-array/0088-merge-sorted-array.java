class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int first=m-1, second=n-1, k=m+n-1;

        while(first>=0 & second >=0){
            if(nums1[first]>=nums2[second]){
                nums1[k]=nums1[first];
                first--;
            }else{
                nums1[k]=nums2[second];
                second--;
            }
            k--;
        }

        while(first>=0){
            nums1[k]=nums1[first];
            first--;k--;

        }
        while(second>=0){
            nums1[k]=nums2[second];
            second--;k--;
        }
        
    }
}