class Solution {
    public int mirrorDistance(int n) {
        String s="";
        int orig=n;
        while(n!=0){
            s=s+Integer.toString(n%10);
            n/=10;
        }
        if(orig-Integer.parseInt(s)<0) return Integer.parseInt(s)-orig;
        return orig-Integer.parseInt(s);
    }
}