class Solution {
    public int maxDepth(String s) {
        int r=0,l=0,maxC=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i) ;
            if(c=='('){
                l++;
                 maxC=Math.max(maxC,l-r);
               
            }
            else if(c==')'){
                r++;
    
            }
            
        }
        return maxC;
    }
}
