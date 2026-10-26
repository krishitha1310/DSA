class Solution {
    public int minDeletions(int[] nums) {
        int i=0,c=0;
        while(i<nums.length-1){
           if ((nums[i] ^ nums[i+1]) == 0) {
                c++;
              
            }
            i++;
        }
        return c;
    }
}