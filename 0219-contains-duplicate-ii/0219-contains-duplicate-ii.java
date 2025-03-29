class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> store = new HashSet<>();

        for(int i =0; i<nums.length; i++){
            if(i>k) store.remove(nums[i-k-1]);
            if(!store.add(nums[i])) return true;

        }

        return false;
        
    }
}