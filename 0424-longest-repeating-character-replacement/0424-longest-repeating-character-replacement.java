class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,maxOcc=1,maxLen=0;
        char ch=s.charAt(0);
        int[] hArr=new int[26];
        for(int j=0;j<s.length();j++){
            int val=(int)s.charAt(j)-65;
            hArr[val]++;
            if(maxOcc<=hArr[val]){
            maxOcc=Math.max(maxOcc,hArr[val]);
             ch=(char)val;
            }
            while((j-i+1)-maxOcc>k){
                val=(int)s.charAt(i)-65;
                hArr[val]--;
                if(s.charAt(i)==ch){
                    maxOcc--;
                }
                i++;
            }
            
            maxLen=Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}