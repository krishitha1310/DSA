class Solution {
    public int hammingWeight(int n) {
        String s="";
        int r=0,c=0;
        while(n!=1){
            r=n%2;
            if(r==1){
                c++;
            }
            n/=2;
            s+=r;
        }
       
        return c+1;
    }
}