class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>>res= new ArrayList<>();

        diffCombinations(1, n, k, res, new ArrayList<>());

        return res;
        
    }

    private void diffCombinations(int value, int n, int k, List<List<Integer>> res, List<Integer> ans){
 
        if(ans.size() == k){
            res.add(new ArrayList<>(ans));
        return;
        }
        for(int i = value; i<=n; i++){
        ans.add(i);
        diffCombinations(i+1, n, k, res, ans);
        ans.remove(ans.size()-1);

    }

    }
}