class Solution {
    public int myAtoi(String s) {
        
        s=s.trim();
        if(s.length()==0)return 0;
        int f=0,i=0,digit=0;

        if(s.charAt(0)=='-'){
            f=1;
            i++;
        }
        else if(s.charAt(0)=='+')i++;
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
         
           if(digit>Integer.MAX_VALUE/10||(digit==Integer.MAX_VALUE/10&&(s.charAt(i)-'0')>7)){
            return (f==1)?Integer.MIN_VALUE:Integer.MAX_VALUE;
           }
            digit=digit*10+(s.charAt(i)-'0');
           i++;
        }
        if(f==1){
            return -digit;
        }
        return digit;
    }
}