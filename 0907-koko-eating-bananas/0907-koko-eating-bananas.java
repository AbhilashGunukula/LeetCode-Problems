class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1; int high = maxPiles(piles); //int ans = 0;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(canEatAll(piles, mid, h)){
               // ans = mid;
                high = mid-1;

            }else{
                low = mid+1;
            }
        }

        return low;
        
    }

    private boolean canEatAll(int [] piles, int mid, int h){
        int hrsToEat = 0;
        for(int pile: piles){
           hrsToEat += (int) Math.ceil((double) pile / mid);

        }

        return hrsToEat <= h;

    }

    private int  maxPiles(int [] piles){
        int maxPile = 0;

        for(int pile : piles){
            maxPile = Math.max(maxPile, pile);
        }

        return maxPile;
    }
}