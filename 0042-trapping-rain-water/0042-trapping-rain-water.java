class Solution {
    public int trap(int[] height) {

        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        maxLeft[0] =0; maxRight[height.length-1]=0;int maxTrapWater = 0;

        for(int i =1; i<height.length; i++){
            maxLeft[i] = Math.max(maxLeft[i-1], height[i-1]);
        }

        for(int i = height.length-2; i>=0; i--){
            maxRight[i] = Math.max(maxRight[i+1], height[i+1]);
        }

        for(int i=1; i<height.length-1; i++){
            maxTrapWater =  maxTrapWater + (Math.min(maxLeft[i], maxRight[i])-height[i]>0?Math.min(maxLeft[i], maxRight[i])-height[i]:0);
        }

        return maxTrapWater;
        
    }
}