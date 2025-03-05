class Solution {
    public int maxArea(int[] height) {
         int left = 0, right = height.length -1;
         int maxContainerWater = 0;

         while(left<right){
            if(height[left]<height[right]){
                maxContainerWater = Math.max(maxContainerWater, height[left]*(right-left));
                left++;
            }else{
                maxContainerWater = Math.max(maxContainerWater, height[right]*(right-left));
                right--;
            }

         }

         return maxContainerWater;
        
    }
}