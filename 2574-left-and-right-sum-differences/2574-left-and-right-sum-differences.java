class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr=new int[nums.length];
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                leftSum[0]=0;
                rightSum[nums.length-i-1]=0;
            }else{
            leftSum[i]=leftSum[i-1]+nums[i-1];
            rightSum[nums.length-i-1]=rightSum[nums.length-i]+nums[nums.length-i];
            }
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return arr;
    }
}