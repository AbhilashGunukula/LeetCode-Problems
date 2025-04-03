class Solution {
    public int findDuplicate(int[] nums) {

        for(int num : nums){
            int indx = Math.abs(num);
            if(nums[indx] < 0){
                return indx;
        }
            nums[indx] = -nums[indx];
        }

        return -1;
        
        
    }
}