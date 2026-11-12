class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1,dec=1,incIn=1,decIn=1,ic=1,dc=1;
        for(int i=1;i<nums.length;i++){
            if(i<nums.length){
                if(nums[i]>nums[i-1]){
                    ic++;
                    inc=Math.max(inc,ic);
                    
                }else{
                    ic=1;
                }
               
            }
            if(i<nums.length){
                if(nums[i]<nums[i-1]){
                    dc++;
                    dec=Math.max(dc,dec);
                }else{
                    dc=1;
                }
                
            }
        }
        return Math.max(inc,dec);
    }
}