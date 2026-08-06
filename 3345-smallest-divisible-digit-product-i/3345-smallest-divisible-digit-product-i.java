class Solution {
    public int smallestNumber(int n, int t) {
        int f=0;
        while(f==0){
            int temp=n,sum=1;
            while(temp!=0){
                sum*=temp%10;
                temp/=10;
            }
            if(sum%t==0){
                return n;
            }
            n++;
        }
        return n;
    }
}