class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<nums2.length;i++){
         int c=0;
        for(int j=i+1;j<nums2.length;j++){
            if(nums2[j]>nums2[i]){
                c=1;
                hm.put(nums2[i],nums2[j]);
                break;
            }
        }
        if(c==0)
         hm.put(nums2[i],-1);
                
       }
      int[] arr=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
            arr[i]=hm.get(nums1[i]);
       }
       return arr;
    }
}