class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lowSpeed = 0, highSpeed = maxSpeed(piles);

        while(lowSpeed<=highSpeed){
            int midSpeed = (lowSpeed + highSpeed)/2;

            int reqSpeed = calculateSpeed(piles, midSpeed);

            if(reqSpeed<=h) highSpeed = midSpeed-1;
            else lowSpeed = midSpeed+1;
        }

        return lowSpeed;
        
    }


    private int calculateSpeed(int[] piles, int midSpeed){

            int reqSpeed = 0;
        
            for(int pile: piles){
                reqSpeed+=Math.ceil((double)(pile)/(double)(midSpeed));
            }

            return reqSpeed;

    }

    private int maxSpeed(int[] piles){
        int speed = Integer.MIN_VALUE;
        for(int pile : piles){
            speed = Math.max(pile, speed);
        }

        return speed;
    }
}