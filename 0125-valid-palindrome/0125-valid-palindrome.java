class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        int l=0;
        int r=str.length()-1;
        boolean p=true;
        str=str.toLowerCase();
        while(l<r){
            if(str.charAt(l)==str.charAt(r)){
                l++;
                r--;
            }
            else{
                p=false;
                break;
            }
        }
        return p;
    }
}