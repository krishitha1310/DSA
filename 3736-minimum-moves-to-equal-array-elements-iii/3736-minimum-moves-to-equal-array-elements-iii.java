class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            max=Math.max(max,n);
        }
        int minC=0;
        for(int n:nums){
            if(n==max){
                continue;
            }
            else{
                minC+=(max-n);
            }
        }return minC;
    }
}