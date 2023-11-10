class Solution {
    public void rotate(int[] nums, int k) {
       
       int len=nums.length-1;
       k=k%(len+1);

       reverse(nums, 0, len-k);
       reverse(nums,len-k+1, len);
       reverse(nums, 0, len);

    }


    public int[] reverse(int[] nums, int start, int end){

        while(start<end){

            nums[start]=nums[start]+nums[end];
            nums[end]=nums[start]-nums[end];
            nums[start]=nums[start]-nums[end];
            start++;
            end--;

        }

        return nums;
        

        }
        
    
}