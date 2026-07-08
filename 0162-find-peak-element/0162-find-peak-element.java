class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;

       else  if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int low=0,high=nums.length-1,mid=low+(high-low)/2;
        while(low<high){
            mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}