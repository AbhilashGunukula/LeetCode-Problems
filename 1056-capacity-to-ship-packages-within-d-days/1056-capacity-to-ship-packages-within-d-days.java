class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int [] res = countMaxNdTotal(weights);
        int left = res[0]; int right = res[1];

        while(left<=right){
            int mid = (left+right)/2;
            if(canBeShipped(weights, mid, days)) right = mid - 1;
            else left = mid + 1;
        }

        return left;
        
    }

    private boolean canBeShipped(int[] weights, int mid, int days){
        int load = 0 ;
        int noOfDays = 1;

        for(int weight : weights){
            if(load + weight > mid ){
                noOfDays++;
                load = weight;
            }else{
                load+= weight;
            }
        }

        return noOfDays <= days;

    }

    private int[] countMaxNdTotal(int[] weights){
        int maxValue = Integer.MIN_VALUE;
        int totalValue = 0;
        for(int weight : weights){
            maxValue = Math.max(maxValue, weight);
            totalValue += weight;
        }

        return new int[] {maxValue, totalValue};
    }
}