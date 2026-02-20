class Solution {
    public int pivotIndex(int[] nums) {
       int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+sum;
            sum=nums[i];
        }
        int val=-1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(0==(nums[nums.length-1]-nums[i])){
                    val=i;
                    break;
                }
            }
            else if(i==nums.length-1){
                if(0==nums[i-1]){
                    val=i;
                    break;
                }
            }
            else if((nums[nums.length-1]-nums[i])==nums[i-1]){
                val=i;
                break;
            }
        }
        return val;
    }
}