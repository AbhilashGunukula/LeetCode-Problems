class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low=1; int high= maxSpeed(piles);

        while(low<=high){

            int mid=(low+high)/2;
            int totalHrs=calculateHours(piles, mid);

            if(totalHrs<=h) high =mid-1;
            else low=mid+1;
        }

        return low;
        
    }

    public static int calculateHours(int[]piles, int mid){

        int totalH=0;

        for(int i=0; i<piles.length; i++){
        
        totalH += Math.ceil((double)(piles[i])/(double)(mid));

        }

        return totalH;
    }

    public int maxSpeed(int[] piles){
        int ans=Integer.MIN_VALUE;

        for(int i=0; i<piles.length; i++){
            ans=Math.max(ans, piles[i]);
        }

        return ans;
    }
}