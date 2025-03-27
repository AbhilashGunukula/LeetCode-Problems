class Solution {
    public void sortColors(int[] nums) {
        int onesCount = 0;
        int zerosCount = 0;
        int twosCount = 0;

        for(int num : nums){
            if(num == 0) zerosCount++;
            else if (num == 1) onesCount++;
            else twosCount++;
        }

        for(int i =0; i< nums.length; i++){
            if(zerosCount != 0){
                nums[i] = 0;
                zerosCount--;
            }else if(onesCount !=0){
                nums[i] = 1;
                onesCount--;
            }else{
                nums[i] = 2;
            }
        }
        
    }
}