class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        boolean p=false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                sum+=i;
        }
        sum+=1;
        if(sum==1)
            p=false;
        else if(num%sum==0)
            p=true;
        return p;
    }
}