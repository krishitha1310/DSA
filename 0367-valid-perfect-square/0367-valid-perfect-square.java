class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        return true;
        long x=(long)Math.sqrt(num);
        if(x*x==num)return true;
        return false;
        
    }
}