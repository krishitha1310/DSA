class Solution {
    public int missingNumber(int[] nums) {
        int m=0;
        for(int i=0;i<=nums.length;i++){
             m^=i;
        }
        int n=0;
        for(int k:nums){
             n^=k;
        }
        int r=m^n;
        return r;
    }
}