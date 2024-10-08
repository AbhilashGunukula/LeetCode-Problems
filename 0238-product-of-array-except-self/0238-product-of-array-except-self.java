class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int [] res = new int[n];

        int target = 1;

        for(int i =0; i<n; i++){
            res[i] = target;
            target*= nums[i];
        }

        target = 1;

        for(int i=n-1; i>=0; i--){
            res[i] *= target;
            target *= nums[i];
        }

        return res;
        
    }
}