class Solution {
    public int removeDuplicates(int[] nums) {

    int j=0; int k=1;
    while(k<nums.length){
        if(nums[k]!=nums[j]){
            //j++;
            nums[++j]=nums[k];
        }
        k++;
    }

    return j+1;
        
    }
}