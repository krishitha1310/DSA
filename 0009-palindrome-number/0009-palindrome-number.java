class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int i=0;
        int j=s.length()-1;
        boolean p=true;
        while(i<j){
            char l=s.charAt(i);
        char r=s.charAt(j);
            if(l==r){
                p=true;
                i++;
                j--;
            }
            else{
                p=false;
                break;
            }
        }
        if(p){
            return true;
        }
        else return false;
     } }