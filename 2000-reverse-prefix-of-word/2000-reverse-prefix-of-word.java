class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str=new StringBuilder();
        int in=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                in=i;
                break;
            }
        }
        if(in==-1){
            return word;
        }
        
        for(int i=in;i>=0;i--){
            str.append(word.charAt(i));
        }
        for(int i=in+1;i<word.length();i++){
            str.append(word.charAt(i));
        }
        return str.toString();
    }
}