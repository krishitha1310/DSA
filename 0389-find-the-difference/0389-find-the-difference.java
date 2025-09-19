class Solution {
    public char findTheDifference(String s, String t) {
       int k=0;
        for(int i=0;i<s.length();i++){
                k^=(int)s.charAt(i);
        }
        int l=0;
        for(int i=0;i<t.length();i++){
                l^=(int)(t.charAt(i));
        }
        int r=k^l;
        char cr=(char)r;
        return cr;
    }
}