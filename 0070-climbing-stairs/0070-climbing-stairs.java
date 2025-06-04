class Solution {
    public int climbStairs(int n) {

        int[] memo = new int [n+1];
        Arrays.fill(memo, -1);

        return noOfWays(n, memo);
        
    }

    private int noOfWays(int n, int[] memo){
        if(n == 1) return 1;
        if(n == 2) return 2;

        if(memo[n] != -1) return memo[n];

        memo[n] =  noOfWays(n-1, memo)+noOfWays(n-2, memo);
        return memo[n];
    }
}