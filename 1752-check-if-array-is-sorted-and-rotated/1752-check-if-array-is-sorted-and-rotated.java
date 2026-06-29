class Solution {
    public boolean check(int[] nums) {
        int c=1;
        int lar=nums[0];
        int[] arr=new int[10];
        for(int i=0;i<nums.length-1;i++){
            if(c==0){
                if(nums[i]>nums[i+1]||nums[i]>lar){
                    return false;
                }
                else continue;
            }
           if(nums[i]<=nums[i+1]){
           
            continue;
           }
           else{
            lar=nums[i];
            c=0;
           }
        }
         if (c == 0 && nums[nums.length - 1] >nums[0]) {
            return false;
        }

        return true;
    }
}