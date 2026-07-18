class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int maxA=Math.min(height[left],height[right])*(right-left);
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            maxA=Math.max(maxA,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxA;
    }
}