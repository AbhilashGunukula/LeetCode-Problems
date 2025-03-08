class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int i =0, j=0;
        int minSubArray = Integer.MAX_VALUE;

        int sum = 0;

        while(j<nums.length){
            sum += nums[j];

            while(sum>=target){
                minSubArray = Math.min(minSubArray, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;

        }

        return minSubArray == Integer.MAX_VALUE ? 0:minSubArray;
        
    }
}