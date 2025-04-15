class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        //List<Integer> res = new ArrayList<>();
      //  boolean[] isUsed = new boolean[nums.length];

        allPermutes(0, nums, ans);

        return ans;
        
    }

    public void allPermutes(int ind, int[] nums, List<List<Integer>> ans){
       /* if(res.size() == nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }*/

        if(ind == nums.length){
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i<nums.length; i++){
                res.add(nums[i]);
            }
            ans.add(res);
            return;
        }

        for(int i = ind; i<nums.length; i++){

            swap(i, ind, nums);
            allPermutes(ind+1, nums, ans);
            swap(i, ind, nums);
        }
    }

    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}