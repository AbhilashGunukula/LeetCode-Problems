class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length-1;
        k = k%(n+1);

        reverse(0, n-k, nums );
        reverse(n-k+1, n, nums);
        reverse(0, n, nums);
        
    }

    private void reverse(int i, int j, int[] nums){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}