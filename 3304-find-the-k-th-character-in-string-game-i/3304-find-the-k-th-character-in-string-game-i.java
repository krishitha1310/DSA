class Solution {
    public String solve(int k,String s){
        if(s.length()>=k) return s;
        int len=s.length();
        for(int i=0;i<len;i++){
            if((int)s.charAt(i)==122)
            s=s+"a";
            else
           s = s + (char)(s.charAt(i) + 1);
        }
        return solve(k,s);
        
    }
    public char kthCharacter(int k) {
        
        String res=solve(k,"a");
        return res.charAt(k-1);
    }
}