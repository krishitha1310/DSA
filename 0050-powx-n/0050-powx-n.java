class Solution {
    public double pow(double x,long n){
        if(x==0) return 0;
        if(n==0) return 1;
        if(n==1) return x;
        double half=pow(x,n/2);
        if(n%2==0) return half*half;
        return x*half*half;
    }
    public double myPow(double x, int n) {
        long N=n;
        if(N>0)  return pow(x,N);
        
        return 1/pow(x,-N);
    }
}