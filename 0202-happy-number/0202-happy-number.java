class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        if(n==1)return true;
        while(n!=1&&!set.contains(n)){
            set.add(n);
            sum=0;
            while(n>0){
                int r=n%10;
                sum+=r*r;
                n/=10;
            }
            n=sum;
            if(sum==1){
                return true;
                
            }
        }
        return false;
    }
}