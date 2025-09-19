class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int s=0;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int c=2;
        while(c<=n){
           s=a+b;
            a=b;
            b=s;
            c++;
        }
        }
        return s;
    }
}