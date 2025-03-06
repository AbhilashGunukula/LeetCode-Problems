class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> memo = new HashSet<Integer>();

        for(int i =0; i<nums.length; i++){

            if(i>k) memo.remove(nums[i-k-1]);

            if(!memo.add(nums[i])) return true;
        }

        return false;

        
    }
}