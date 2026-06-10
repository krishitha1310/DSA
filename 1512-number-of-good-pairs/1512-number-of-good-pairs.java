class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int n:nums){
            h.put(n,h.getOrDefault(n,0)+1);
        }
        for(int m:h.values()){
                if(m==1) continue;
                c+=m*(m-1)/2;
        }
        return c;
    }
}