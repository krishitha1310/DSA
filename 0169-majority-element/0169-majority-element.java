class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int maxC=Integer.MIN_VALUE,maxV=nums[0];
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(maxC<hm.getOrDefault(nums[i],0)){
                maxC=hm.getOrDefault(nums[i],0);
                maxV=nums[i];
            }
        }
        return maxV;
    }
}