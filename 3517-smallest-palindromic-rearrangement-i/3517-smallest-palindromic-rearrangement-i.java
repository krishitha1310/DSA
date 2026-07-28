import java.util.*;
class Solution {
    public String smallestPalindrome(String s) {
        char[] ch=new char[s.length()];
        Arrays.fill(ch, '~');
        for(int i=0;i<s.length()/2;i++){
            ch[i]=s.charAt(i);
        }
        Arrays.sort(ch);
        ch[s.length()/2]=s.charAt(s.length()/2);
        int tem=s.length()/2-1;
        if(s.length()%2!=0){
            
            for(int j=s.length()/2+1;j<s.length();j++){
                ch[j]=ch[tem];
                tem--;
            }
        }
        else{
            for(int k=s.length()/2;k<s.length();k++){
                ch[k]=ch[tem];
                tem--;
            }
        }
       return new String(ch);
    }
}