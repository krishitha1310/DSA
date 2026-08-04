class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
            hm.put(nums[i],nums[i]);
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
       }
       List<Integer> list=new LinkedList<>();
       for(int i=min+1;i<max;i++){
        if(hm.containsKey(i)){
            continue;
        }
        else{
            list.add(i);
        }
       }
       return list;
    }
}