import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int count=0,curr=0,maxL=0;
        for(int i:set){
            if(!set.contains(i-1)){
                curr=i;
                count=1;
            }
            while(set.contains(curr+1)){
                count++;
                curr++;
            }
            maxL=Math.max(count,maxL);
        }
    return maxL;
    }
}