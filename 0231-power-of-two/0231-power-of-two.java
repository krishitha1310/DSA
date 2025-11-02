class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
        return true;
        if(n==8)
        return true;
        int sum=1;
        boolean p=false;
        long sq=(long)Math.sqrt(n);
        for(int i=1;i<=sq;i++){
            sum*=2;
            if(sum==n){
                p=true;
                break;
            }
        }
        return p;
    }
}