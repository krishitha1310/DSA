class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        while(i<j){
           char charI=s.charAt(i),charJ=s.charAt(j);
           if(Character.isLetterOrDigit(charI)&&Character.isLetterOrDigit(charJ)){
            if(charI!=charJ){
                return false;
            }
            else{
                i++;
                j--;
            }
           }
           else if(!Character.isLetterOrDigit(charI)){
            while(i<j&&!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
           }
           else{
            while(i<j&&!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
           }
        }
        return true;
    }
}