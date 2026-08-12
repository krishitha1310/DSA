import java.util.*;
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen=0,len=0,i=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int j=0;j<nums.length;j++){
                int temp=nums[j];
                hm.put(temp,hm.getOrDefault(temp,0)+1);

                if(hm.get(temp)>k){
                    while(hm.get(temp)>k){
                        hm.put(nums[i],hm.get(nums[i])-1);
                        i++;
                    }
                }
                len=j-i+1;
                maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}