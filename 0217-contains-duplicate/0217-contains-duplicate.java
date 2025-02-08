class Solution {
    public boolean containsDuplicate(int[] nums) {

       /* Arrays.sort(nums);

        for(int i =1; i<nums.length; i++){
            if(nums[i] == nums[i-1]) return true;
        }

        return false;
        */

        HashSet<Integer> checkDuplicates = new HashSet<>();

        for(int num : nums){
            if(!checkDuplicates.add(num)) return true;
        }
        
        return false;

    }
}