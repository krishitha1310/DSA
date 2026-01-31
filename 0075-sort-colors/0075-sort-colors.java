import java.util.*;
class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1,k=0;
        while(k<=j){
            if(nums[k]==0){
                nums[k]=nums[i];
                nums[i]=0;
                i++;
                k++;
            }
            else if(nums[k]==1){
                k++;
            }
            else{
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}