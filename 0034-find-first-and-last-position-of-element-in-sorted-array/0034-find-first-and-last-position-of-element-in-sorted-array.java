class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int mid=(low+high)/2;
        int[] arr=new int[2];
        Arrays.fill(arr,-1);
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                int x=mid;
                while(x>=0&&nums[x]==target){
                    arr[0]=x;
                    x--;
                }
                x=mid+1;
                while(x<nums.length&&nums[x]==target){
                    arr[1]=x;
                    x++;
                }
               break;
            }
            if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(arr[0]!=-1&&arr[1]==-1){
            arr[1]=mid;
        }
        else if(arr[1]!=-1&&arr[0]==-1){
            arr[0]=mid;
        }
        return arr;
    }
}