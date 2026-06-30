import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k%=nums.length;
        }
        if(nums.length==1) k=1;
        int l=0,r=nums.length-k-1,temp=nums[0];
        while(l<=r){
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        l=nums.length-k;
        r=nums.length-1;
         while(l<=r){
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        l=0;
        r=nums.length-1;
         while(l<=r){
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(nums));
    }
}