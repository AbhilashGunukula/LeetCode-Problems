class Solution {
    public int subsetXORSum(int[] nums) {
        
        int[] res = new int[1];
        subsetSum(nums, 0, 0, res);

        return res[0];

    }

    private void subsetSum(int[] nums, int ind, int currXOR, int[] totalSum){
        if(ind == nums.length){
            totalSum[0] += currXOR;
            return;
        }

        subsetSum(nums, ind+1, currXOR ^ nums[ind], totalSum);

        subsetSum(nums, ind+1, currXOR, totalSum);
    }
}