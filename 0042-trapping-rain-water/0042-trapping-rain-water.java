class Solution {
    public int trap(int[] height) {
        int maxLeft = 0; int maxRight = 0; int trappedWater = 0;

        int left =0; int right = height.length-1;

        while(left<right){
            if(height[left] <= height[right]){
                if(height[left] < maxLeft){
                    trappedWater += maxLeft - height[left];
                }else{
                    maxLeft = height[left];
                }
                left++;
            }else{
                if(height[right]<maxRight){
                    trappedWater += maxRight - height[right];
                }else{
                    maxRight = height[right];
                }
                right--;
            }
        }

        return trappedWater;
        
    }
}