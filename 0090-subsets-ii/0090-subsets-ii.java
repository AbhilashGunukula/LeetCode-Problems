class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        findSubsets(0, nums, ans, res);

        return ans;  
    }

        public void findSubsets(int ind, int[] nums, List<List<Integer>> ans, List<Integer> res ){
        ans.add(new ArrayList<>(res));

        for(int i = ind; i<nums.length; i++){

            if(i!= ind && nums[i] == nums[i-1]) continue;
            res.add(nums[i]);
            findSubsets(i+1, nums, ans, res);
            res.remove(res.size()-1);

        }
    }
}