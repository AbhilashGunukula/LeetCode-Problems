class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int num : prices){
           if(num>minPrice){
             maxPrice =  Math.max(maxPrice, num-minPrice );
        }else{
            minPrice = num;
        }
        }


        return maxPrice;
        
    }
}