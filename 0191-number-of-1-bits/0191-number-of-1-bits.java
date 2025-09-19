class Solution {
    public int hammingWeight(int n) {
        String s="";
        int r=0;
        while(n!=1){
            r=n%2;
            n/=2;
            s+=r;
        }
        s+="1";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}