class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr=new int[nums.length*2];
        int i=0;
        for(i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int x=nums.length;
       for(i=nums.length-1;i>=0;i--){
        arr[x++]=nums[i];
       }
       return arr;
    }
}