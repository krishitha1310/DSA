class Solution {
    public boolean hasAlternatingBits(int n) {
        String s="";
        int f=1;
       while(n!=1){
            s=s+(n%2);
            n/=2; 
            if(s.length()!=1){
                if(s.charAt(s.length()-1)==s.charAt(s.length()-2)){
                    f=0;
                    break;
                }
            }
            if(n==1){
                s=s+"1";
                if(s.charAt(s.length()-1)==s.charAt(s.length()-2)){
                    f=0;
                    break;
                }
            }
       }
       if(f==0)
        return false;
        else return true;
    }
}