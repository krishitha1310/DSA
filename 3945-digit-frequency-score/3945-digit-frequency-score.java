class Solution {
    public int digitFrequencyScore(int n) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       int sum=0;
       while(n!=0){
        hm.put(n%10,hm.getOrDefault(n%10,0)+1);
        n/=10;
       }
       for (Integer key : hm.keySet()) {
           sum+=(key*hm.get(key));
       }
       return sum; 
    }
}