class Solution {
    public boolean validDigit(int n, int x) {
        int pres=0;
        if(n==x) return false;
        int f=-1;
            while(n!=0){
                if(n%10==x){
                    pres=1;
                }
                if(n/10!=0){
                    f=n/10;
                }n/=10;
            }
            if(f!=x&&pres==1) return true;
            return false;
    }
}