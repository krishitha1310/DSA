class Solution {
    public String largestOddNumber(String num) {
       
        for(int i=num.length()-1;i>=0;i--){
            String s="";
            s=s+num.charAt(i);
            if(Integer.parseInt(s)%2!=0){
                return num.substring(0,i+1);
            }
           
        }
        return "";
    }
}