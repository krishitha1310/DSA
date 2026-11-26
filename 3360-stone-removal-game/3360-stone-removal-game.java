class Solution {
    public boolean canAliceWin(int n) {
        int a=0,b=0,pr=10;
        if(n<10){
            return false;
        }
        n-=10;
        if(n==0){
            return true;
        }
        while(n!=0){
            if(n>=pr-1){
                n-=(pr-1);
                pr-=1;
            }
            else{
                a=1;
                break;
            }

            if(n>=pr-1){
                n-=(pr-1);
                pr=pr-1;
            }
            else{
                b=1;
                break;
            }
            if(n==0){
                a=1;
                break;
            }

        }
        return a==1;
    }
}