class Solution {
    public String reverseWords(String s) {
        String res="";
        int i=s.length()-1;
        while(i>=0){
            String a="";
            while(s.charAt(i)!=' '){
                a+=s.charAt(i);
                if(i==0){
                    break;
                }
                i--;
            }
            int j=a.length()-1;
            while(j>=0){
                res+=a.charAt(j);
                j--;
            }
            if(i!=0){
            if(s.charAt(i-1)!=' '){
            res+=" ";
            i--;
            }
            else {
            i--;
            }
            }
            else
            i--;
            

        }
        return res.trim();
    }
}