class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        int i=0,j=2*n/2,x=0;
        while(i<2*n/2&&j<2*n){
            res[x++]=nums[i];
            res[x++]=nums[j];
            i++;
            j++;
        }
        return res;
    }
}