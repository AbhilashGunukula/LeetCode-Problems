class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();

        nParenthesis(res, 0, 0, n, "");

        return res;
        
    }

    private void nParenthesis(List<String> res, int open, int close, int max, String curr ){
        if(curr.length() == 2 * max ){
            res.add(curr);
            return;
        }

        if(open < max){
            nParenthesis(res, open+1, close, max, curr+"(");
        }

        if(close < open){
            nParenthesis(res, open, close+1, max, curr+")");
        }
    }
}