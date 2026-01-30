class Solution {
    public int[] moveZeroes(int[] nums) {
        int i=0,j=0;
        while(j<nums.length)
        {
            if(nums[i]!=0&&nums[j]!=0){
                i++;
                j++;
                continue;
            }
            if(j!=0&&nums[j]!=0){
                if(nums[i]==0){
                nums[i++]=nums[j];
                nums[j]=0;
                j++;
                continue;
                }
                else{
                    i++;
                    nums[i]=nums[j];
                    nums[j]=0;
                    j++;
                    continue;
                }
            }
            j++;
        }
        return nums;
    }
}