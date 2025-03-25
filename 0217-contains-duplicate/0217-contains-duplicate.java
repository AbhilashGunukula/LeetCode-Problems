class Solution {
    public boolean containsDuplicate(int[] nums) {

       HashSet<Integer> checkDuplicates = new HashSet<>();

        for(int num : nums){
            if(!checkDuplicates.add(num)) return true;
        }
        
        return false;


    }
}