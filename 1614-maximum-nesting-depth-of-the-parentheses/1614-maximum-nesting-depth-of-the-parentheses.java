class Solution {
    public int maxDepth(String s) {
        int r=0,l=0,maxC=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                l++;
                 maxC=Math.max(maxC,l-r);
               
            }
            else if(ch==')'){
                r++;
    
            }
            
        }
        return maxC;
    }
}