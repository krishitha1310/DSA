class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;

        }
        while(sum/10!=0){
            int n=sum;
            int rem=0;
                while(n!=0){
                    rem+=n%10;
                    n/=10;
                }
            sum=rem;
        }
        return sum;
    }
}