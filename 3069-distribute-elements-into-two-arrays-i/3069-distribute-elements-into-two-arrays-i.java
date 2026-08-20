class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int i1=1,i2=1;
        for(int i=2;i<nums.length;i++){
                if(arr1[i1-1]>arr2[i2-1]){
                    arr1[i1++]=nums[i];
                }else{
                    arr2[i2++]=nums[i];
                }
        }
        
        for(int i=0;i<i2;i++){
           arr1[i1++]=arr2[i];
        }
        return arr1;
    }
}