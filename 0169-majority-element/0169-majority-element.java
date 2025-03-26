class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int topElement = 0;

        for(int num : nums){
            if(count==0){
                topElement = num;
            }

            if(topElement != num) count--;
            else count++;
        }

        return topElement;
        
    }
}