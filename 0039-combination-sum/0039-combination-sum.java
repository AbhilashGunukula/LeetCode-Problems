class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();

        sumVariations(candidates, 0, target, res, new ArrayList<>());

        return res;
        
    }

    private void sumVariations(int[] candidates,int ind, int target, List<List<Integer>> res, List<Integer> ans){
        if(ind == candidates.length){
            if(target == 0) res.add(new ArrayList<>(ans));
            return;
        }

        if(candidates[ind] <= target){
            ans.add(candidates[ind]);
            sumVariations(candidates, ind, target-candidates[ind], res, ans );
            ans.remove(ans.size()-1);
        }

        sumVariations(candidates, ind+1, target, res, ans);
    }
}