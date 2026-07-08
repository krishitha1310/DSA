class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1,mid=(low+high)/2;

        while(low<=high){
            mid=low+(high-low)/2;
            if ((mid == 0 || nums[mid] != nums[mid - 1]) &&
    (mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {
    return nums[mid];
}
            if(nums[mid]==nums[mid+1]&&(high-mid+1)%2!=0){
                low=mid+2;
            }
            else if(nums[mid]==nums[mid+1]&&(high-mid-1)%2==0){
                high=mid-1;
            }
            else if(nums[mid]==nums[mid-1]&&(mid-low-1)%2==0){
                low=mid+1;
            }
            else{
                high=mid-2;
            }
        } 
        return nums[mid];  
    }
}