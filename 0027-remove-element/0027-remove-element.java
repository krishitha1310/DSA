import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int[] r=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                r[k++]=nums[i];

            }
        }
        for(int i=0;i<k;i++){
            nums[i]=r[i];
        }
        return k;
    }
}