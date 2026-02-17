class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        if(s.length()==0){
            return 0;
        }
        int[] hArr=new int[256];
        int i=0,maxLen=Integer.MIN_VALUE;
        for(int j=0;j<s.length();j++){
            int val=(int)s.charAt(j);
            hArr[val]++;
            while(hArr[val]>1){
                int v=(int)s.charAt(i);
                hArr[v]--;
                i++;
            }
            
            maxLen=Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}
