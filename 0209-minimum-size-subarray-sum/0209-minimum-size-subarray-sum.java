class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,sum=0,minLen=Integer.MAX_VALUE,f=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];

            while(sum>=target){
                minLen=Math.min(minLen,j-i+1);
                 f=1;
                sum-=nums[i];
                i++;
            }
            }
        if(f==0){
            return 0;
        }
        return minLen;
    }
}