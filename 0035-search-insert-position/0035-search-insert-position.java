class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int mid=(l+r)/2;
        while(l<=r){
            if(target==nums[mid]){
               
                break;
            }
            else if(target<nums[mid]){
                r=mid-1;
                mid=(l+r)/2;
            }
            else{
                l=mid+1;
                mid=(l+r)/2;
            }
        }
       
        if(target==nums[mid])
        return mid;
        else{
            if(target>nums[mid]){
                return mid+1;
            }
            else{ 
                if(mid==0){
                    return 0;
                }
                else
                 return mid-1;
            }
        }
    }
}