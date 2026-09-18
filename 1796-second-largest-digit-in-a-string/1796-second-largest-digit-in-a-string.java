class Solution {
    public int secondHighest(String s) {
        int max1=-1,max2=-1,n=-1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
            n=s.charAt(i)-'0';
            if(n>max1){
                max2=max1;
                max1=n;
            }
            else if(n>max2&&n!=max1){
                max2=n;
            }
        }
        return max2;
    }
}